public class Automovil {

    int i;
    private String modelo;
    private String fabricante;
    private Motor motor;
    private TipoAutomovil tipo;
    private Color color;

    private Estanque Estanque;

    private Persona conductor;

    private Rueda[] ruedas;

    private int indiceRuedas;

    private int ultimoId;

    public int getIndiceRuedas() {
        return indiceRuedas;
    }

    public void setIndiceRuedas(int indiceRuedas) {
        this.indiceRuedas = indiceRuedas;
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public int getUltimoId() {
        return ultimoId;
    }

    public void setUltimoId(int ultimoId) {
        this.ultimoId = ultimoId;
    }

    private int id;

    Automovil(String fabricante, String modelo, Color colo) {

        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = colo;

    }

    public int getId() {
        return id;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public Estanque getEstanque() {
        return Estanque;
    }

    public void setEstanque(Estanque estanque) {
        Estanque = estanque;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    public void addRuedas(Rueda rueda) {

        this.ruedas[i++] = rueda;

    }

    public String verDetalle() {

        StringBuilder sb = new StringBuilder();
        sb.append("auto.Id = ").append(getId()).append("\n auto.fabricante = ").append(getFabricante())
                .append("\n auto.modelo = ").append(getModelo());

        if (this.getTipo() != null) {
            sb.append("\nauto.tipo = ").append(this.getTipo().getDescripcion());
        }

        if (this.getMotor() != null) {
            sb.append("\n auto.Cilindrada = ").append(this.getMotor().getCilindrada());
            sb.append("\n auto.tipo = ").append(this.getMotor().getTipo());
        }
        if (this.getConductor() != null) {
            sb.append("\n auto.conductor = ").append(getConductor().getInformacion());
        }
        if (this.getRuedas() != null) {
            sb.append("\n Ruedas del Automovil = ");
            for (Rueda r : this.getRuedas()) {
                sb.append("\n").append(r.getFabricante()).append(" aro:").append(r.getAro()).append(" ancho:")
                        .append(r.getAro());
            }

        }

        sb.append("\n auto.Color = ").append(Color.NEGO);
        sb.append("\n estanque = " + getEstanque().getCapacidad());
        // sb.append("\n")
        return sb.toString();

    }

    public String getacelerar(int rpm) {

        return "el auto " + this.getFabricante() + " acelerado a " + rpm + "rpm";

    }

    public String getfrenar() {
        return getFabricante() + " " + getModelo() + " frenado!";
    }

    public float getcalcularConsumo(int km, float porcentajecalculo) {

        float valorfinal = km / this.getEstanque().getCapacidad() * porcentajecalculo;

        return valorfinal;

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Automovil)) {
            return false;
        }

        Automovil a = (Automovil) obj;
        return (this.fabricante != null && this.modelo != null
                && this.fabricante.equals(a.getFabricante())
                && this.modelo.equals(a.getModelo()));
    }

}
