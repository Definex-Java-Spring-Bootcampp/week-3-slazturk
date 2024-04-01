package com.patika.garantiservice.entity;

import java.time.LocalDateTime;

import com.patika.garantiservice.entity.Application;
import com.patika.garantiservice.enums.ApplicationStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Application {

    private Long userId;
    private LocalDateTime createDate;
    private ApplicationStatus applicationStatus;
}
