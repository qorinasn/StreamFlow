/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author LENOVO
 */
@Entity
@Table(name = "barang_admin", catalog = "uas_ppbo", schema = "")
@NamedQueries({
    @NamedQuery(name = "BarangAdmin.findAll", query = "SELECT b FROM BarangAdmin b")
    , @NamedQuery(name = "BarangAdmin.findById", query = "SELECT b FROM BarangAdmin b WHERE b.id = :id")
    , @NamedQuery(name = "BarangAdmin.findByNamapaket", query = "SELECT b FROM BarangAdmin b WHERE b.namapaket = :namapaket")
    , @NamedQuery(name = "BarangAdmin.findByStok", query = "SELECT b FROM BarangAdmin b WHERE b.stok = :stok")})
public class BarangAdmin implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "namapaket")
    private String namapaket;
    @Basic(optional = false)
    @Column(name = "stok")
    private int stok;

    public BarangAdmin() {
    }

    public BarangAdmin(Integer id) {
        this.id = id;
    }

    public BarangAdmin(Integer id, String namapaket, int stok) {
        this.id = id;
        this.namapaket = namapaket;
        this.stok = stok;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getNamapaket() {
        return namapaket;
    }

    public void setNamapaket(String namapaket) {
        String oldNamapaket = this.namapaket;
        this.namapaket = namapaket;
        changeSupport.firePropertyChange("namapaket", oldNamapaket, namapaket);
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        int oldStok = this.stok;
        this.stok = stok;
        changeSupport.firePropertyChange("stok", oldStok, stok);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BarangAdmin)) {
            return false;
        }
        BarangAdmin other = (BarangAdmin) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "view.BarangAdmin[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
