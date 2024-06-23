package org.algorithm;

import org.algorithm.constraint.IConstraint;
import org.algorithm.objective.IObjective;

public class AlgorithmConfig {
    private double solveTimeLimitSec;
    private IConstraint[] constraints;
    private IObjective[] objectives;

    public double getSolveTimeLimitSec() {
        return solveTimeLimitSec;
    }

    public void setSolveTimeLimitSec(double solveTimeLimitSec) {
        this.solveTimeLimitSec = solveTimeLimitSec;
    }

    public IConstraint[] getConstraints() {
        return constraints;
    }

    public void setConstraints(IConstraint[] constraints) {
        this.constraints = constraints;
    }

    public IObjective[] getObjectives() {
        return objectives;
    }

    public void setObjectives(IObjective[] objectives) {
        this.objectives = objectives;
    }
}
