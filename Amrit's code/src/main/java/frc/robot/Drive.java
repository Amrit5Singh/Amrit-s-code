/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;

/**
 * Add your docs here.
 */
public class Drive {


    public static TalonSRX rightDriveOne;
	public static TalonSRX rightDriveTwo;
	public static TalonSRX rightDriveThree;
	public static TalonSRX leftDriveOne;
	public static TalonSRX leftDriveTwo;
    public static TalonSRX leftDriveThree;
    
    private Drive(){
		rightDriveOne = new TalonSRX(0);
		rightDriveTwo = new TalonSRX(1);
		rightDriveThree = new TalonSRX(2);
		leftDriveOne = new TalonSRX(3);
		leftDriveTwo = new TalonSRX(4);
        leftDriveThree = new TalonSRX(5);
        

		
    }

    public void rightSideControl(double value){
		rightDriveOne.set(ControlMode.PercentOutput, value);
		rightDriveTwo.set(ControlMode.PercentOutput, value);
		rightDriveThree.set(ControlMode.PercentOutput, value);
	}
	
	public void leftSideControl(double value){
		leftDriveOne.set(ControlMode.PercentOutput, value);
		leftDriveTwo.set(ControlMode.PercentOutput, value);
		leftDriveThree.set(ControlMode.PercentOutput, value);
    }
    //The percent output is the rate of speed that the Talons (motors) will run at.

	public static Drive getInstance() {
		return null;
	}




    }