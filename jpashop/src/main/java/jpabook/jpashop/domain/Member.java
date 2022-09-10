package jpabook.jpashop.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Member {

    @Id @GeneratedValue
    @Column(name= "member_id")
    private long id;

    private String name;

    @Embedded
    private Address address;

    @OneToMany(mappedBy = "member") //난 맵핑된 거울, 읽기전용
    private List<Order> order = new ArrayList<>();

}
