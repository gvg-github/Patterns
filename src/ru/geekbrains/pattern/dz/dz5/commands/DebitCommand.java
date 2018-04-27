package ru.geekbrains.pattern.dz.dz5.commands;

import ru.geekbrains.pattern.dz.dz5.documents.CheckDocument;

public class DebitCommand implements Command {

    private CheckDocument checkDocument;

    public DebitCommand(CheckDocument checkDocument){
        this.checkDocument = checkDocument;
    }

    @Override
    public void execute() {
        checkDocument.createDebit();
    }
}
