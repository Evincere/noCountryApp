package com.nocountry.appnocountry.infrastructure.database.entity;

import java.sql.Timestamp;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.annotation.CreatedDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@DynamicUpdate //https://www.baeldung.com/spring-data-jpa-dynamicupdate
@Builder //https://www.baeldung.com/lombok-builder
@Table(name = "PERSONS")
public class PersonEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "PERSON_ID")
  private Long id;

  @Column(name = "PERSON_NAME")
  private String name;

  @Column(name = "LAST_NAME")
  private String lastName;

  private String dni;

  private String email;

  @Column(name = "PHONE_NUMBER")
  private String phoneNumber;

  private LocalDate dateBirth;

  @Column(name = "CREATE_TIMESTAMP", updatable = false)
  @CreationTimestamp
  private Timestamp createTimestamp;

  @Column(name = "SOFT_DELETE")
  private Boolean softDelete;

}
