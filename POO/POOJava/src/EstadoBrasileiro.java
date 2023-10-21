public enum EstadoBrasileiro {
    /**
     *
     */
    SAO_PAULO("SP", "SÃO PAULO"),
    MARANHAO("MA", "Maranhão");

    private String nome;
    private String sigla;

    private EstadoBrasileiro(String nome, String sigla)
    {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getSigla()
    {
        return this.sigla;
    }

    public String getNome()
    {
        return this.nome;
    }


}
