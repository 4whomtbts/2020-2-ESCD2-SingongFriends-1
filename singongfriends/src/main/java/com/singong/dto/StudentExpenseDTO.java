package com.singong.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class StudentExpenseDTO {

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class StudentExpenseGet {
        private int studentExpenseId;
        private int amountBeforeReduction;
        private int reductionAmount;
        private int amountAfterReduction;
    }

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class StudentExpenseCreate {
        private int studentId;
        private int expenseId;
        private int semester;
    }
}
