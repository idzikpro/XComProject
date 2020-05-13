package pl.idzikpro.xcom.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "soldier")
@ApiModel(value = "Craft")
public class SoldierEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;
    @Column(name = "rank")
    @ApiModelProperty(value = "rank of soldier")
    String rank;
    @Column(name = "name")
    @ApiModelProperty(value = "name of soldier")
    String name;
    @Column(name = "nationality")
    String nationality;
    @Column(name = "timeunits")
    int timeUnits;
    @Column(name = "energy")
    int energy;
    @Column(name = "health")
    int health;
    @Column(name = "bravery")
    int bravery;
    @Column(name = "reactions")
    int reactions;
    @Column(name = "firingaccuracy")
    int firingAccuracy;
    @Column(name = "throwingaccuracy")
    int throwingAccuracy;
    @Column(name = "strength")
    int strength;
    @Column(name = "psiskill")
    int psiSkill;
    @Column(name = "psistrength")
    int psiStrength;
    @Column(name = "meleeaccuracy")
    int meleeAccuracy;
    @Column(name = "armourtype")
    String armourType;
    @Column(name = "mission")
    int missions;
    @Column(name = "alienskilled")
    int killed;
    @Column(name = "picture")
    String picture;
}
