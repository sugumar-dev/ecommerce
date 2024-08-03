package com.houseoffourleaf.ecommerce.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Generated
@Getter
@Setter
public class Users extends Audit {

    @Id
    @Column(name = "user_id", length = 30, nullable = false)
    private String userId;

    @Column(name = "email_id", length = 300, nullable = false)
    private String emailId;

    @Column(name = "password", length = 100, nullable = false)
    private String password;

    @Column(name = "active_ind", nullable = false)
    private char activeIndicator;

    @Column(name = "last_login_timestamp")
    private Timestamp lastLoginTimestamp;

    @OneToOne
    @JoinColumn(name = "role", nullable = false, columnDefinition = "DEFAULT 'CUSTOMER'")
    private UserRole role;

    @Column(name = "email_verified", nullable = false, columnDefinition = "DEFAULT 'N'")
    private char emailVerified;

    @Column(name = "contact_number")
    private Integer contactNumber;

    @Column(name = "contact_verified", nullable = false, columnDefinition = "DEFAULT 'N'")
    private char contactVerified;

    @Column(name="insert_user")
    private String insertUser;

    @Column(name="insert_timestamp")
    private LocalDateTime insertTimestamp;

    @Column(name="update_user")
    private String updateUser;

    @Column(name="update_timestamp")
    private LocalDateTime updateTimestamp;

}
