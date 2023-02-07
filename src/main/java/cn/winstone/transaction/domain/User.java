package cn.winstone.transaction.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "USER")
@Data
public class User {
    @Id
    private int id;
    private String name;
}
