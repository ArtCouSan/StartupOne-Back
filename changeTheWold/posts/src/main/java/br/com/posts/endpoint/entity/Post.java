package br.com.posts.endpoint.entity;

import br.com.posts.endpoint.enums.PostStatusEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "TB_POST")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "POST_ID")
    private Long id;

    @Column(name = "POST_TITLE")
    private String title;

    @Column(name = "POST_DESCRIPTION")
    private String description;

    @Column(name = "POST_PRINCIPAL_IMAGE")
    private File image;

    @Column(name = "POST_GALLERY_IMAGE")
    private List<File> images;

    @Column(name = "POST_DATE_INSERT")
    private LocalDateTime dateInsert;

    @Column(name = "POST_DATE_ALTER")
    private LocalDateTime dateAlter;

    @Column(name = "POST_DATE_DELETE")
    private LocalDateTime dateDelete;

    @Column(name = "POST_STATUS")
    private PostStatusEnum status;

}
