package pl.idzikpro.xcom.entity;

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
public class SoldierEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;
    @Column(name = "rank")
    String rank;
    @Column(name = "name")
    String name;
    @Column (name = "nationality")
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
