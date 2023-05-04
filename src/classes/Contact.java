package src.classes;

public abstract class Contact {
    private String email;
    private String cellphone;
    private boolean whatsapp;
    private boolean telegram;

    public Contact(String email, String cellphone, boolean whatsapp, boolean telegram){
        this.email = email;
        this.cellphone = cellphone;
        this.whatsapp = whatsapp;
        this.telegram = telegram;
    }

    public String getCellphone() {
        return cellphone;
    }

    public String getEmail() {
        return email;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelegram(boolean telegram) {
        this.telegram = telegram;
    }

    public void setWhatsapp(boolean whatsapp) {
        this.whatsapp = whatsapp;
    }
}
