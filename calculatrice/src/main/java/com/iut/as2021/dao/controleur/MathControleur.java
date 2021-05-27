package com.iut.as2021.dao.controleur;

import com.iut.as2021.exceptions.MathsExceptions;
import com.iut.as2021.metier.MathResultat;
import com.opensymphony.xwork2.ActionSupport;

public class MathControleur extends ActionSupport {

    private String expression;
    private double resultat;
    private MathResultat manager;

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public double getResultat() {
        return resultat;
    }

    public void setResultat(double resultat) {
        this.resultat = resultat;
    }

    public String runCalcul() throws MathsExceptions {
        // code horrible !
        manager = new MathResultat(expression);
        resultat = manager.calculate();
        //return String.valueOf(manager.getValue());
        return ActionSupport.SUCCESS;
    }
}
