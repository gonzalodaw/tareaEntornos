package cuentas;

/**
 *
 * @author Gonzalo
 */
public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * constructor vacio
     */
    public CCuenta()
    {
    }

    /**
     * constructor con los siguientes parametros
     * @param nom
     * @param cue
     * @param sal
     * @param tipo
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Metodo que devuelve el saldo 
     * @return
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Metodo para ingresar en cuenta con su excepcion si se hace ingreso negativo
     * @param cantidad
     * @throws Exception
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Metodo para retirar dnero de cuenta con sus excepciones si se retira cantidad negativa o no hay saldo suficiente
     * @param cantidad
     * @throws Exception
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * get del nombre para visualizar el nombre
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Set nombre para modificarlo
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * get cuenta para visualizar cuenta
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * set cuenta para modificarlo
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * get saldo para visualizar saldo
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * set saldo para modificarlo
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * get TipoInteres para visualizar TipoInteres
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * set TipoInteres para modificarlo
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
    
}
