import java.util.Date;

public class voo {

    String codigo;
    Date dataHora;
    double tarifaBasica;
    double tarifaBusiness;
    double tarifaPremium;
    double valorPrimeiraBagagem;
    double valorBagagensAdicionais;
    String moeda;

    public String getCodigo(){
        return codigo;
    }

    public Date getDataHora(){
        return dataHora;
    }

    public double getTarifaBasica(){
        return tarifaBasica;
    }

    public double getTarifaBusiness(){
        return tarifaBusiness;
    }

    public double getTarifaPremium(){
        return tarifaPremium;
    }

    public double getValorPrimeiraBagagem(){
        return valorPrimeiraBagagem;
    }

    public double getValorBagagensAdicionais(){
        return valorBagagensAdicionais;
    }

    public String getMoeda(){
        return moeda;
    }

}