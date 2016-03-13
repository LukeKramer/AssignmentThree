package com.assignment3Refactored.Configuration;

import com.assignment3Refactored.BuildShapes.*;
import com.assignment3Refactored.Interface.InterfaceShape;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * Created by student on 2016/03/13.
 */
@Configuration
public class Config {

    @Bean(name="circ")
    public InterfaceShape getCircle(){return new CircleBuild();}

    @Bean(name="octo")
    public InterfaceShape getOctogon(){return new OctogonBuild();}

    @Bean(name="pent")
    public InterfaceShape getPentagon(){return new Pentagon();}

    @Bean(name="square")
    public InterfaceShape getSquare(){return new SquareBuild();}

    @Bean(name="tri")
    public InterfaceShape getTriangle(){return new TriangleBuild();}







}
