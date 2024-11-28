package modal;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "tb_presenca")

public class Presenca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "data_presenca")
    private Date datapresenca;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDatapresenca() {
        return datapresenca;
    }

    public void setDatapresenca(Date datapresenca) {
        this.datapresenca = datapresenca;
    }
}
