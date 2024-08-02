package com.houseoffourleaf.ecommerce.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "api_event_log")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ApiEventLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "customer", referencedColumnName = "id")
    private Customer customer;

    @Column(name = "event_timestamp", nullable = false)
    private LocalDateTime eventTimestamp;

    @Column(name = "method", length = 10, nullable = false)
    private String method;

    @Column(name = "response_code", nullable = false)
    private int responseCode;

    @Column(name = "url", nullable = false)
    private int url;

    @Column(name = "request_header", length = 600)
    private String requestHeader;

    @Column(name = "request_payload", length = 4000)
    private String requestPayload;

    @Column(name = "response_payload", length = 4000)
    private String responsePayload;

    @Column(name = "event_type", length = 25, nullable = false)
    private String eventType;

}