package com.daimengshi.ddcms.service.api;

import com.daimengshi.ddcms.web.base.BaseService;
import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.Page;
import com.daimengshi.ddcms.service.entity.model.DmsLog;

import java.util.List;

public interface DmsLogService extends BaseService {

    /**
     * 删除所有日志
     * @return
     */
    public void deleteAll();


    /**
     * find model by primary key
     *
     * @param id
     * @return
     */
    public DmsLog findById(Object id);


    /**
     * find all model
     *
     * @return all <DmsLog
     */
    public List<DmsLog> findAll();


    /**
     * delete model by primary key
     *
     * @param id
     * @return success
     */
    public boolean deleteById(Object id);


    /**
     * delete model
     *
     * @param model
     * @return
     */
    public boolean delete(DmsLog model);


    /**
     * save model to database
     *
     * @param model
     * @return
     */
    public boolean save(DmsLog model);


    /**
     * save or update model
     *
     * @param model
     * @return if save or update success
     */
    public boolean saveOrUpdate(DmsLog model);


    /**
     * update data model
     *
     * @param model
     * @return
     */
    public boolean update(DmsLog model);


    public void join(Page<? extends Model> page, String joinOnField);
    public void join(Page<? extends Model> page, String joinOnField, String[] attrs);
    public void join(Page<? extends Model> page, String joinOnField, String joinName);
    public void join(Page<? extends Model> page, String joinOnField, String joinName, String[] attrs);
    public void join(List<? extends Model> models, String joinOnField);
    public void join(List<? extends Model> models, String joinOnField, String[] attrs);
    public void join(List<? extends Model> models, String joinOnField, String joinName);
    public void join(List<? extends Model> models, String joinOnField, String joinName, String[] attrs);
    public void join(Model model, String joinOnField);
    public void join(Model model, String joinOnField, String[] attrs);
    public void join(Model model, String joinOnField, String joinName);
    public void join(Model model, String joinOnField, String joinName, String[] attrs);

    public void keep(Model model, String... attrs);
    public void keep(List<? extends Model> models, String... attrs);
}