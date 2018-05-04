package ru.geekbrains.pattern.dz6.parthners;

public abstract class Partner {
    private String name;
    private String inn;
    private String kpp;
    private String account;

    public Partner(String name, String inn, String kpp, String account) {
        this.name = name;
        this.inn = inn;
        this.kpp = kpp;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public String getInn() {
        return inn;
    }

    public String getKpp() {
        return kpp;
    }

    public String getAccount() {
        return account;
    }
}
