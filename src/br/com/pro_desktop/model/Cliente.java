
package br.com.pro_desktop.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author gardh
 */
public class Cliente implements Serializable {

    private Integer idCli;
    private String nome;
    private String cpf;

    @Override
    public String toString() {
        return "Cliente{" + "idCli=" + idCli + ", nome=" + nome + ", cpf=" + cpf + '}';
    }
    

    public Integer getIdCli() {
        return idCli;
    }

    public void setIdCli(Integer idCli) {
        this.idCli = idCli;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + Objects.hashCode(this.idCli);
        hash = 19 * hash + Objects.hashCode(this.cpf);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.idCli, other.idCli)) {
            return false;
        }
        return true;
    }
    
    

}
