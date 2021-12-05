package yu.seatastorage.jpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "`storage`") //对应order表
@Setter
@Getter
public class Storage {
    @Id
    @Column(name = "goods_id")
    private Integer id; //订单编号

    private Integer quantity;
}
