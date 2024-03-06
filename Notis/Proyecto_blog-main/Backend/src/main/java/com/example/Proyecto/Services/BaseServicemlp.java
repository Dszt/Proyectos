package com.example.Proyecto.Services;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import com.example.Proyecto.Repositories.BaseRepository;
import com.example.Proyecto.entities.Base;

public abstract class BaseServicemlp <E extends Base, ID extends Serializable>implements BaseServices<E,ID>{
    protected BaseRepository<E,ID> baseRepository;

    public BaseServicemlp(BaseRepository<E,ID>baseRepository){
        this.baseRepository=baseRepository;
    }

    @Override
    @Transactional
    public List<E> findAll() throws Exception {
        // TODO Auto-generated method stub
       try {
           List<E>entities = baseRepository.findAll();
           return entities;
        
       } catch (Exception e) {
        throw new Exception(e.getMessage());
       }
    }

    @Override
    @Transactional
    public E findById(ID id) throws Exception {
        try {
            Optional<E> entityOptional = baseRepository.findById(id);
            return entityOptional.get();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
         // TODO: handle exception
        }
    }

    @Override
    @Transactional
    public E save(E entity) throws Exception {
        try {
            entity= baseRepository.save(entity);
            return entity;
        
        } catch (Exception e) {
            throw new Exception (e.getMessage());
        }
    }

    @Override
    @Transactional
    public E update(ID id, E entity) throws Exception {
        try {
            Optional<E> entityOptional = baseRepository.findById(id);
            E entityUpdate = entityOptional.get();
            entityUpdate =baseRepository.save(entity);
            return entityUpdate;
        
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean delete(ID id) throws Exception {
        try {
            if (baseRepository.existsById(id)){
                baseRepository.deleteById(id);
                return true;
            }else{
                throw new Exception();
            }

        
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
    
    
}
