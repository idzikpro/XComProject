package pl.idzikpro.xcom.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "ship")
@ApiModel(value = "Ship")
public class ShipEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;
    @JsonIgnore
    @OneToMany(mappedBy = "ship",
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.DETACH,
                    CascadeType.MERGE,
                    CascadeType.REFRESH
            })
    private List<AlienEntity> alienEntities = new ArrayList<>();
    @Column(name = "size")
    @ApiModelProperty(value = "size of ship")
    String size;
    @Column(name = "name")
    @ApiModelProperty(value = "name of ship")
    String name;
    @Column(name = "maxspeed")
    int maxSpeed;
    @Column(name = "weaponpower")
    int weaponPower;
    @Column(name = "weaponrangekm")
    int weaponRangeKm;
    @Column(name = "weaponrangeunits")
    int weaponRangeUnits;
    @Column(name = "damagedcapacity")
    int damageCapacity;
    @Column(name = "downedpoints")
    int downedPoints;
    @Column(name = "destroyedpoints")
    int destroyedPoints;
    @Column(name = "escapetime")
    int escapeTime;
    @Column(name = "firinginterval")
    int firingInterval;
    @Column(name = "jpg0")
    String jpg0;
    @Column(name = "jpg1")
    String jpg1;
    @Column(name = "jpg2")
    String jpg2;
    @Column(name = "jpg3")
    String jpg3;

    public void addAlienToList(AlienEntity alienEntity) {
        alienEntities.add(alienEntity);
    }
}
