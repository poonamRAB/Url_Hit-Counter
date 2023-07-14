package com.geekster.URLHitCounter.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UrlHitCounter {

    private String visitorName;

    private int urlHitCount;
}
