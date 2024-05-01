package com.Jahirul.expense_10.repository;

import com.Jahirul.expense_10.entity.ExpenseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseRepository extends JpaRepository<ExpenseEntity,String> {

}
