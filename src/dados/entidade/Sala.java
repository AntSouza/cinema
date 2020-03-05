package dados.entidade;

public class Sala {
    private Integer id;
    private Integer quantidadeCadeiras;
    private String tipoDeTela;
    private Sessao sessao;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuantidadeCadeiras() {
        return quantidadeCadeiras;
    }

    public void setQuantidadeCadeiras(Integer quantidadeCadeiras) {
        this.quantidadeCadeiras = quantidadeCadeiras;
    }

    public String getTipoDeTela() {
        return tipoDeTela;
    }

    public void setTipoDeTela(String tipoDeTela) {
        this.tipoDeTela = tipoDeTela;
    }

    public Sessao getSessao() {
        return sessao;
    }

    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }
    
        }
