package com.Jahirul.expense_10.Service

import com.Jahirul.expense_10.dto.requestDto.ExpenseRequestDto;
import com.Jahirul.expense_10.entity.ExpenseEntity;
import com.Jahirul.expense_10.repository.ExpenseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {
    private final ExpenseRepository expenseRepository;

    public ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    public String createExpense(ExpenseRequestDto requestDto) {
        if (requestDto != null) {
            ExpenseEntity expense = new ExpenseEntity();
            expense.setExpenseCategory(requestDto.getExpenseCategory());
            expense.setExpenseName(requestDto.getExpenseName());
            expense.setDescription(requestDto.getDescription());
            expense.setDate(requestDto.getDate());
            expense.setAmount(requestDto.getAmount());
            expenseRepository.save(expense);
            return "Expense Created";
        } else
            return "Unable to create Expense Entity";
    }

    public List<ExpenseEntity> getAllExpense() {
        return expenseRepository.findAll();
    }
}
