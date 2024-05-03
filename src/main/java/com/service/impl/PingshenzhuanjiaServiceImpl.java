package com.service.impl;

import com.utils.StringUtil;
import com.service.DictionaryService;
import com.utils.ClazzDiff;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import org.springframework.lang.Nullable;
import org.springframework.util.Assert;
import com.dao.PingshenzhuanjiaDao;
import com.entity.PingshenzhuanjiaEntity;
import com.service.PingshenzhuanjiaService;
import com.entity.view.PingshenzhuanjiaView;

/**
 * 评审专家 服务实现类
 */
@Service("pingshenzhuanjiaService")
@Transactional
public class PingshenzhuanjiaServiceImpl extends ServiceImpl<PingshenzhuanjiaDao, PingshenzhuanjiaEntity> implements PingshenzhuanjiaService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        Page<PingshenzhuanjiaView> page =new Query<PingshenzhuanjiaView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
