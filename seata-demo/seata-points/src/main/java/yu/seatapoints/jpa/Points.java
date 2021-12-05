package yu.seatapoints.jpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "`points`") //对应order表
@Setter
@Getter
public class Points {
    @Id
    @Column(name = "member_id")
    private Integer id; //订单编号
    private Integer points; //会员编号


    public Points() {
    }

    public Points(Integer memberId, Integer points) {
        this.id = memberId;
        this.points = points;

    }
}
