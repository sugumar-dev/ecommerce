package com.houseoffourleaf.ecommerce.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "image")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Image extends Audit{

    @Id
    @Column(name = "uuid", nullable = false)
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID uuid;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @Lob
    @Column(name = "data", nullable = false)
    private byte[] data;
    @Column(name = "filename", nullable = false, length = 100)
    private String filename;
    @Column(name = "format", nullable = false, length = 10)
    private String format;

    @Column(name = "order", nullable = false)
    private Integer order;

    @Column(name = "active_ind", nullable = false)
    private char activeInd;

    @ManyToOne
    @JoinColumn(name = "device", nullable = false)
    private DeviceType device;

    @Column(name = "insert_user", nullable = false, length = 30)
    private String insertUser;

    @Column(name = "insert_timestamp", nullable = false)
    private LocalDateTime insertTimestamp;

    @Column(name = "update_user", length = 30)
    private String updateUser;

    @Column(name = "update_timestamp")
    private LocalDateTime updateTimestamp;

}
