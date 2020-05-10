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
@Table(name = "craft")
public class CraftEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;
    @Column(name = "name")
    String name;
    @Column(name = "maxspeed")
    int maxSpeed;
    @Column(name = "acceleration")
    int acceleration;
    @Column(name = "fuelcapacity")
    int fuelCapacity;
    @Column(name = "damagedcapacity")
    int damageCapacity;
    @Column(name = "cargospace")
    int cargoSpace;
    @Column(name = "hwpcapacity")
    int hwpCapacity;
    @Column(name = "weaponpods")
    int weaponPods;
    @Column(name = "jpg0")
    String jpg0;
    @Column(name = "jpg1")
    String jpg1;
    @Column(name = "jpg2")
    String jpg2;
    @Column(name = "jpg3")
    String jpg3;
}