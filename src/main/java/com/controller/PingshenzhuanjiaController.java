
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 评审专家
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/pingshenzhuanjia")
public class PingshenzhuanjiaController {
    private static final Logger logger = LoggerFactory.getLogger(PingshenzhuanjiaController.class);

    private static final String TABLE_NAME = "pingshenzhuanjia";

    @Autowired
    private PingshenzhuanjiaService pingshenzhuanjiaService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表非注册的service
    //注册表service
    @Autowired
    private YonghuService yonghuService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("用户".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        else if("评审专家".equals(role))
            params.put("pingshenzhuanjiaId",request.getSession().getAttribute("userId"));
        CommonUtil.checkMap(params);
        PageUtils page = pingshenzhuanjiaService.queryPage(params);

        //字典表数据转换
        List<PingshenzhuanjiaView> list =(List<PingshenzhuanjiaView>)page.getList();
        for(PingshenzhuanjiaView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        PingshenzhuanjiaEntity pingshenzhuanjia = pingshenzhuanjiaService.selectById(id);
        if(pingshenzhuanjia !=null){
            //entity转view
            PingshenzhuanjiaView view = new PingshenzhuanjiaView();
            BeanUtils.copyProperties( pingshenzhuanjia , view );//把实体数据重构到view中
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody PingshenzhuanjiaEntity pingshenzhuanjia, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,pingshenzhuanjia:{}",this.getClass().getName(),pingshenzhuanjia.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");

        Wrapper<PingshenzhuanjiaEntity> queryWrapper = new EntityWrapper<PingshenzhuanjiaEntity>()
            .eq("username", pingshenzhuanjia.getUsername())
            .or()
            .eq("pingshenzhuanjia_phone", pingshenzhuanjia.getPingshenzhuanjiaPhone())
            .or()
            .eq("pingshenzhuanjia_id_number", pingshenzhuanjia.getPingshenzhuanjiaIdNumber())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        PingshenzhuanjiaEntity pingshenzhuanjiaEntity = pingshenzhuanjiaService.selectOne(queryWrapper);
        if(pingshenzhuanjiaEntity==null){
            pingshenzhuanjia.setCreateTime(new Date());
            pingshenzhuanjia.setPassword("123456");
            pingshenzhuanjiaService.insert(pingshenzhuanjia);
            return R.ok();
        }else {
            return R.error(511,"账户或者评审专家手机号或者评审专家身份证号已经被使用");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody PingshenzhuanjiaEntity pingshenzhuanjia, HttpServletRequest request) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        logger.debug("update方法:,,Controller:{},,pingshenzhuanjia:{}",this.getClass().getName(),pingshenzhuanjia.toString());
        PingshenzhuanjiaEntity oldPingshenzhuanjiaEntity = pingshenzhuanjiaService.selectById(pingshenzhuanjia.getId());//查询原先数据

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
        //根据字段查询是否有相同数据
        Wrapper<PingshenzhuanjiaEntity> queryWrapper = new EntityWrapper<PingshenzhuanjiaEntity>()
            .notIn("id",pingshenzhuanjia.getId())
            .andNew()
            .eq("username", pingshenzhuanjia.getUsername())
            .or()
            .eq("pingshenzhuanjia_phone", pingshenzhuanjia.getPingshenzhuanjiaPhone())
            .or()
            .eq("pingshenzhuanjia_id_number", pingshenzhuanjia.getPingshenzhuanjiaIdNumber())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        PingshenzhuanjiaEntity pingshenzhuanjiaEntity = pingshenzhuanjiaService.selectOne(queryWrapper);
        if("".equals(pingshenzhuanjia.getPingshenzhuanjiaPhoto()) || "null".equals(pingshenzhuanjia.getPingshenzhuanjiaPhoto())){
                pingshenzhuanjia.setPingshenzhuanjiaPhoto(null);
        }
        if(pingshenzhuanjiaEntity==null){
            pingshenzhuanjiaService.updateById(pingshenzhuanjia);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"账户或者评审专家手机号或者评审专家身份证号已经被使用");
        }
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids, HttpServletRequest request){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        List<PingshenzhuanjiaEntity> oldPingshenzhuanjiaList =pingshenzhuanjiaService.selectBatchIds(Arrays.asList(ids));//要删除的数据
        pingshenzhuanjiaService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName, HttpServletRequest request){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        Integer yonghuId = Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId")));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            List<PingshenzhuanjiaEntity> pingshenzhuanjiaList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            PingshenzhuanjiaEntity pingshenzhuanjiaEntity = new PingshenzhuanjiaEntity();
//                            pingshenzhuanjiaEntity.setUsername(data.get(0));                    //账户 要改的
//                            //pingshenzhuanjiaEntity.setPassword("123456");//密码
//                            pingshenzhuanjiaEntity.setPingshenzhuanjiaName(data.get(0));                    //评审专家姓名 要改的
//                            pingshenzhuanjiaEntity.setPingshenzhuanjiaPhone(data.get(0));                    //评审专家手机号 要改的
//                            pingshenzhuanjiaEntity.setPingshenzhuanjiaIdNumber(data.get(0));                    //评审专家身份证号 要改的
//                            pingshenzhuanjiaEntity.setPingshenzhuanjiaPhoto("");//详情和图片
//                            pingshenzhuanjiaEntity.setSexTypes(Integer.valueOf(data.get(0)));   //性别 要改的
//                            pingshenzhuanjiaEntity.setPingshenzhuanjiaEmail(data.get(0));                    //电子邮箱 要改的
//                            pingshenzhuanjiaEntity.setYanjiufangxiangTypes(Integer.valueOf(data.get(0)));   //研究方向 要改的
//                            pingshenzhuanjiaEntity.setPingshenzhuanjiaContent("");//详情和图片
//                            pingshenzhuanjiaEntity.setCreateTime(date);//时间
                            pingshenzhuanjiaList.add(pingshenzhuanjiaEntity);


                            //把要查询是否重复的字段放入map中
                                //账户
                                if(seachFields.containsKey("username")){
                                    List<String> username = seachFields.get("username");
                                    username.add(data.get(0));//要改的
                                }else{
                                    List<String> username = new ArrayList<>();
                                    username.add(data.get(0));//要改的
                                    seachFields.put("username",username);
                                }
                                //评审专家手机号
                                if(seachFields.containsKey("pingshenzhuanjiaPhone")){
                                    List<String> pingshenzhuanjiaPhone = seachFields.get("pingshenzhuanjiaPhone");
                                    pingshenzhuanjiaPhone.add(data.get(0));//要改的
                                }else{
                                    List<String> pingshenzhuanjiaPhone = new ArrayList<>();
                                    pingshenzhuanjiaPhone.add(data.get(0));//要改的
                                    seachFields.put("pingshenzhuanjiaPhone",pingshenzhuanjiaPhone);
                                }
                                //评审专家身份证号
                                if(seachFields.containsKey("pingshenzhuanjiaIdNumber")){
                                    List<String> pingshenzhuanjiaIdNumber = seachFields.get("pingshenzhuanjiaIdNumber");
                                    pingshenzhuanjiaIdNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> pingshenzhuanjiaIdNumber = new ArrayList<>();
                                    pingshenzhuanjiaIdNumber.add(data.get(0));//要改的
                                    seachFields.put("pingshenzhuanjiaIdNumber",pingshenzhuanjiaIdNumber);
                                }
                        }

                        //查询是否重复
                         //账户
                        List<PingshenzhuanjiaEntity> pingshenzhuanjiaEntities_username = pingshenzhuanjiaService.selectList(new EntityWrapper<PingshenzhuanjiaEntity>().in("username", seachFields.get("username")));
                        if(pingshenzhuanjiaEntities_username.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(PingshenzhuanjiaEntity s:pingshenzhuanjiaEntities_username){
                                repeatFields.add(s.getUsername());
                            }
                            return R.error(511,"数据库的该表中的 [账户] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                         //评审专家手机号
                        List<PingshenzhuanjiaEntity> pingshenzhuanjiaEntities_pingshenzhuanjiaPhone = pingshenzhuanjiaService.selectList(new EntityWrapper<PingshenzhuanjiaEntity>().in("pingshenzhuanjia_phone", seachFields.get("pingshenzhuanjiaPhone")));
                        if(pingshenzhuanjiaEntities_pingshenzhuanjiaPhone.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(PingshenzhuanjiaEntity s:pingshenzhuanjiaEntities_pingshenzhuanjiaPhone){
                                repeatFields.add(s.getPingshenzhuanjiaPhone());
                            }
                            return R.error(511,"数据库的该表中的 [评审专家手机号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                         //评审专家身份证号
                        List<PingshenzhuanjiaEntity> pingshenzhuanjiaEntities_pingshenzhuanjiaIdNumber = pingshenzhuanjiaService.selectList(new EntityWrapper<PingshenzhuanjiaEntity>().in("pingshenzhuanjia_id_number", seachFields.get("pingshenzhuanjiaIdNumber")));
                        if(pingshenzhuanjiaEntities_pingshenzhuanjiaIdNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(PingshenzhuanjiaEntity s:pingshenzhuanjiaEntities_pingshenzhuanjiaIdNumber){
                                repeatFields.add(s.getPingshenzhuanjiaIdNumber());
                            }
                            return R.error(511,"数据库的该表中的 [评审专家身份证号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        pingshenzhuanjiaService.insertBatch(pingshenzhuanjiaList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }


    /**
    * 登录
    */
    @IgnoreAuth
    @RequestMapping(value = "/login")
    public R login(String username, String password, String captcha, HttpServletRequest request) {
        PingshenzhuanjiaEntity pingshenzhuanjia = pingshenzhuanjiaService.selectOne(new EntityWrapper<PingshenzhuanjiaEntity>().eq("username", username));
        if(pingshenzhuanjia==null || !pingshenzhuanjia.getPassword().equals(password))
            return R.error("账号或密码不正确");
        String token = tokenService.generateToken(pingshenzhuanjia.getId(),username, "pingshenzhuanjia", "评审专家");
        R r = R.ok();
        r.put("token", token);
        r.put("role","评审专家");
        r.put("username",pingshenzhuanjia.getPingshenzhuanjiaName());
        r.put("tableName","pingshenzhuanjia");
        r.put("userId",pingshenzhuanjia.getId());
        return r;
    }

    /**
    * 注册
    */
    @IgnoreAuth
    @PostMapping(value = "/register")
    public R register(@RequestBody PingshenzhuanjiaEntity pingshenzhuanjia, HttpServletRequest request) {
//    	ValidatorUtils.validateEntity(user);
        Wrapper<PingshenzhuanjiaEntity> queryWrapper = new EntityWrapper<PingshenzhuanjiaEntity>()
            .eq("username", pingshenzhuanjia.getUsername())
            .or()
            .eq("pingshenzhuanjia_phone", pingshenzhuanjia.getPingshenzhuanjiaPhone())
            .or()
            .eq("pingshenzhuanjia_id_number", pingshenzhuanjia.getPingshenzhuanjiaIdNumber())
            ;
        PingshenzhuanjiaEntity pingshenzhuanjiaEntity = pingshenzhuanjiaService.selectOne(queryWrapper);
        if(pingshenzhuanjiaEntity != null)
            return R.error("账户或者评审专家手机号或者评审专家身份证号已经被使用");
        pingshenzhuanjia.setCreateTime(new Date());
        pingshenzhuanjiaService.insert(pingshenzhuanjia);

        return R.ok();
    }

    /**
     * 重置密码
     */
    @GetMapping(value = "/resetPassword")
    public R resetPassword(Integer  id, HttpServletRequest request) {
        PingshenzhuanjiaEntity pingshenzhuanjia = pingshenzhuanjiaService.selectById(id);
        pingshenzhuanjia.setPassword("123456");
        pingshenzhuanjiaService.updateById(pingshenzhuanjia);
        return R.ok();
    }


    /**
     * 忘记密码
     */
    @IgnoreAuth
    @RequestMapping(value = "/resetPass")
    public R resetPass(String username, HttpServletRequest request) {
        PingshenzhuanjiaEntity pingshenzhuanjia = pingshenzhuanjiaService.selectOne(new EntityWrapper<PingshenzhuanjiaEntity>().eq("username", username));
        if(pingshenzhuanjia!=null){
            pingshenzhuanjia.setPassword("123456");
            boolean b = pingshenzhuanjiaService.updateById(pingshenzhuanjia);
            if(!b){
               return R.error();
            }
            return R.ok();
        }else{
           return R.error("账号不存在");
        }
    }


    /**
    * 获取用户的session用户信息
    */
    @RequestMapping("/session")
    public R getCurrPingshenzhuanjia(HttpServletRequest request){
        Integer id = (Integer)request.getSession().getAttribute("userId");
        PingshenzhuanjiaEntity pingshenzhuanjia = pingshenzhuanjiaService.selectById(id);
        if(pingshenzhuanjia !=null){
            //entity转view
            PingshenzhuanjiaView view = new PingshenzhuanjiaView();
            BeanUtils.copyProperties( pingshenzhuanjia , view );//把实体数据重构到view中

            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }
    }


    /**
    * 退出
    */
    @GetMapping(value = "logout")
    public R logout(HttpServletRequest request) {
        request.getSession().invalidate();
        return R.ok("退出成功");
    }



}
