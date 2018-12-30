package com.dawn.springjpah2.entity;

import lombok.Getter;
import lombok.NonNull;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@IdClass(DptStatusDescription.class)
@Table(name = "DPT_STATUS_DESCRIPTION")
@Getter
public class DptStatusDescription implements Serializable {

    @Id
    @Column(name = "STATUS_CODE")
    private int statusCode;
    @Id
    @Column(name = "LANGUAGE_CODE")
    private int languageCode;
    @NotNull
    @NonNull
    @Column(name = "DESCRIPTION")
    private String Description;
}
