public class PersonajeEXE {
    private String nombre;
    private int nivel;
    private int experiencia;
    private int vida;
    private boolean vivo;

//constructor vacioooo
    public PersonajeEXE() {
    }

//constrctor con todoooo
    public PersonajeEXE(String nombre, int nivel, int experiencia, int vida, boolean vivo) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.experiencia = experiencia;
        this.vida = vida;
        this.vivo = vivo;
    }
//getter y setterssss
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    //tostring:D
    @Override
    public String toString() {
        return "PersonajeEXE{" +
                "nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                ", experiencia=" + experiencia +
                ", vida=" + vida +
                ", vivo=" + vivo +
                '}';
    }

    //metodoz propios
    public void ponerNombre(String nombre) {
        this.nombre = nombre;
    }

    public int ganarExperiencia() {
        this.experiencia += 10;
        return this.experiencia;
    }

    public int subirNivel() {
        this.nivel++;
        this.experiencia = 0;
        return this.nivel;
    }

    public int recibirDano() {
        this.vida -= 15;
        if (this.vida <= 0) {
            this.vida = 0;
            this.vivo = false;
        }
        return this.vida;
    }

    public boolean curarse() {
        if (this.vivo) {
            this.vida += 20;
            return true;
        }
        return false;
    }

    public void mostrarEstado() {
        System.out.println("\n ===================== \n  ESTADO DEL PERSONAJEXE");
        System.out.println("Nombre: " + nombre);
        System.out.println("Nivel: " + nivel);
        System.out.println("Experiencia: " + experiencia);
        System.out.println("Vida: " + vida);
        System.out.println("Vivo: " + (vivo ? "si" : "no"));
    }
}
