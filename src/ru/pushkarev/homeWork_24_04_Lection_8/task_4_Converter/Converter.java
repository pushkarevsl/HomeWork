package ru.pushkarev.homeWork_24_04_Lection_8.task_4_Converter;

public class Converter {

    public static void main(String[] args) {

    }

    public static Act convert(Contract contract) {
        Act aux = new Act(contract.getIdNumber(), contract.getData(), contract.getTitleProduct());
        return aux;
    }

}
