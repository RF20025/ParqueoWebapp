/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.edu.occ.ues.ingenieria.prn335.parqueowebapp.app.entity;

import java.io.Serializable;
import java.util.Date;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

/**
 *
 * @author Maria Regalado
 */
@Entity
@Table(name = "reserva_historial", catalog = "parqueo", schema = "public")
@NamedQueries({
    @NamedQuery(name = "ReservaHistorial.findAll", query = "SELECT r FROM ReservaHistorial r")})
public class ReservaHistorial implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_reserva_historial")
    private Long idReservaHistorial;
    @Column(name = "fecha_alcanzado")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAlcanzado;
    @Column(name = "activo")
    private Boolean activo;
    @JoinColumn(name = "id_reserva", referencedColumnName = "id_reserva")
    @ManyToOne
    private Reserva idReserva;
    @JoinColumn(name = "id_tipo_reserva_secuencia", referencedColumnName = "id_tipo_reserva_secuencia")
    @ManyToOne
    private TipoReservaSecuencia idTipoReservaSecuencia;

    public ReservaHistorial() {
    }

    public ReservaHistorial(Long idReservaHistorial) {
        this.idReservaHistorial = idReservaHistorial;
    }

    public Long getIdReservaHistorial() {
        return idReservaHistorial;
    }

    public void setIdReservaHistorial(Long idReservaHistorial) {
        this.idReservaHistorial = idReservaHistorial;
    }

    public Date getFechaAlcanzado() {
        return fechaAlcanzado;
    }

    public void setFechaAlcanzado(Date fechaAlcanzado) {
        this.fechaAlcanzado = fechaAlcanzado;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public Reserva getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(Reserva idReserva) {
        this.idReserva = idReserva;
    }

    public TipoReservaSecuencia getIdTipoReservaSecuencia() {
        return idTipoReservaSecuencia;
    }

    public void setIdTipoReservaSecuencia(TipoReservaSecuencia idTipoReservaSecuencia) {
        this.idTipoReservaSecuencia = idTipoReservaSecuencia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idReservaHistorial != null ? idReservaHistorial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReservaHistorial)) {
            return false;
        }
        ReservaHistorial other = (ReservaHistorial) object;
        if ((this.idReservaHistorial == null && other.idReservaHistorial != null) || (this.idReservaHistorial != null && !this.idReservaHistorial.equals(other.idReservaHistorial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.edu.occ.ues.ingenieria.prn335.mapeo.mapeo.ReservaHistorial[ idReservaHistorial=" + idReservaHistorial + " ]";
    }
    
}
