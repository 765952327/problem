package cn.winstone.transaction.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Table(name = "BLOG")
@Data
@Entity
public class Blog {
    @Id
    private int id;
    private String name;
    private int authorId;
}
