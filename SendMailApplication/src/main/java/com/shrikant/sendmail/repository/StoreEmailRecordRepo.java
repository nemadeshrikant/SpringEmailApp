package com.shrikant.sendmail.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.shrikant.sendmail.entity.StoreEmailRecordEntity;


public interface StoreEmailRecordRepo extends JpaRepository<StoreEmailRecordEntity,Long> {

}
