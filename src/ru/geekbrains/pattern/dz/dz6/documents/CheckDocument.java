package ru.geekbrains.pattern.dz.dz6.documents;

import ru.geekbrains.pattern.dz.dz6.parthners.Company;
import ru.geekbrains.pattern.dz.dz6.parthners.Contractor;
import ru.geekbrains.pattern.dz.dz6.parthners.ContractorContract;

public class CheckDocument extends AbstractDocument {

    private int sum;

    public CheckDocument(int sum) {
        this.sum = sum;
    }

    public int getSum() {
        return sum;
    }

    @Override
    public void createDoc(Company company, Contractor contractor, ContractorContract contract) {

    }

    public void createDebit(){
        //Создание в базе данных записи по дебиту
    }
    public void createCredit(){
        //Создание в базе данных записи по кредиту
    }
}
