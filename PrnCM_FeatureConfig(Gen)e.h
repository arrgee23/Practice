/**
 * @file        PrnCM_FeatureConfig.h (Ramona_L)
 * @brief       This is the configuration file for XXX subsystem.
 *
 * <b> Copyright 2003 by Samsung Electronics, Inc. All rights reserved.</b>
 *
 * This software is the confidential and proprietary information
 * of Samsung Electronics, Inc. ("Confidential Information").\n
 * You shall not disclose such Confidential Information and shall use
 * it only in accordance with the terms of the license agreement
 * you entered into with Samsung.
 *
 * @designer    
 * @imp         
 * @dept        Development 1 Group / Digital Printing Division
 * @date        3/22/2018(Y-M-D)
 * @version     
 */
/***********************************************************************/
#ifndef __PRNCM_FEATURECONFIG_H__
#define __PRNCM_FEATURECONFIG_H__

/*Undefine values                                                      */ 

/** 
 * @brief Color Single Pass printing
 */ 
#undef PRNDEF_COLOR_SINGLE_PASS

/** 
 * @brief Color Multi Pass printing
 */ 
#undef COLOR_MULTI_PASS

/** 
 * @brief Cross-Scan (Color Single Pass only)
 */ 
#undef HPVC_CROSS_SCAN

/** 
 * @brief JBIG OTF Printing
 */ 
#undef HPVC_JBIG_OTF

/** 
 * @brief Manual Duplex support
 */ 
#undef PRNDEF_SUPPORT_MANUALDUPLEX

/** 
 * @brief When printing Contone RGB data(UTE only) use this definition
 */ 
#undef PRNDEF_CONTONE

/** 
 * @brief LSU Reverse Scan Direction support
 */ 
#undef PRNDEF_SUPPORT_LSU_REVSCAN

/** 
 * @brief Not UI, confirm by referring only Engine(Tray) state
 */ 
#undef PRNDEF_SUPPORT_TRAY_CONFIRM_BY_ENGINE

/** 
 * @brief HPVC Dual Beam Mode
 */ 
#undef HPVC_DUAL_BEAM

/** 
 * @brief Manual Feeder only support
 */ 
#define PRNDEF_SUPPORT_MANUAL_FEEDER_TRAY

/** 
 * @brief setting PVC by getting Video Beam Mode from Engine
 */ 
#undef PRNDEF_DYNAMIC_BEAMMODE_SELECTION

/** 
 * @brief To support toner installation without crum. (Only for development)
 */ 
#undef PRNDEF_DEV_TONER_NOT_INSTALLED_WOCHECK

/** 
 * @brief To make footer using new font maker.
 */ 
#undef PRNDEF_SUPPORT_NEW_FONTMAKER

/** 
 * @brief In case of supporting EDC for LED model
 */ 
#undef PRNDEF_EDC_UI_LED

/** 
 * @brief In case of supporting EDC for 2byte LCD model
 */ 
#undef PRNDEF_EDC_UI_MULTIBYTE_LCD

/** 
 * @brief To support S/W no-chip for china & India model
 */ 
#undef PRNDEF_SUPPORT_NOCHIP

/** 
 * @brief In case of compulsive printing with paper mismatch, used paper property will be selected by PCB.
 */ 
#define PRNDEF_MISMATCH_PAPER_PROPERTY_USING_PCB

/** 
 * @brief To support fast boot up of engine.
 */ 
#undef PRNDEF_SUPPORT_FAST_ENGINE_BOOTUP

/** 
 * @brief To control band number of special paper.
 */ 
#define PRNDEF_OMIT_BAND_FOR_SHORT_PAGE_INTERVAL

/** 
 * @brief To operate motor idling for seperated toner type.
 */ 
#define PRNDEF_SUPPORT_INIT_MOTOR_OPERATION

/** 
 * @brief Machine can't recognize paper empty. Because it has not paper empty sensor.
 */ 
#undef PRNDEF_SUPPORT_NO_EMPTY_SENSOR

/** 
 * @brief To send dot coverage to engine.
 */ 
#undef PRNDEF_SUPPORT_DOTCOVERAGE_PAPERCONTROL

/** 
 * @brief The type fo crum in toner cartridge(or Imaging unit) is zCrum.
 */ 
#undef PRNDEF_CRUM_TYPE_XCRUM

/** 
 * @brief To support manual feeder guide (not manual feeder) (ex. Whitney3)
 */ 
#undef PRNDEF_SUPPORT_MANUAL_FEEDER_GUIDE

/** 
 * @brief To ignore mismathc afeter first page is printed.
 */ 
#undef PRNDEF_IGNORE_MISMATCH_AFTER_FIRST_PAGE

/** 
 * @brief To support color toner.
 */ 
#undef PRNDEF_TONER_COLOR

/** 
 * @brief For crum test for frame jig, always EEPROM is used not real crum.
 */ 
#undef PRNDEF_FRAME_JIG_CRUM

/** 
 * @brief To saving engine debug to flash.
 */ 
#undef PRNDEF_SUPORT_ENG_DBG_FLASH_BACKUP

/** 
 * @brief To support CTD(Color Toner Density)
 */ 
#undef PRNDEF_SUPPORT_CTD

/** 
 * @brief In case of absence of manual tray.
 */ 
#undef PRNDEF_NO_MANUAL_TRAY

/** 
 * @brief To ignore paper empty error on prinitng status.(Only for color multi path.)
 */ 
#undef PRNDEF_IGNORING_PAPEREMPTY_ON_PRINTING_AND_EXIT

/** 
 * @brief To support installation of imaging unit without crum. (ex. Carlsen/Violet)
 */ 
#undef PRNDEF_IMGUNIT_WO_CRUM

/** 
 * @brief To get engine status in sleep mode.
 */ 
#undef PRNDEF_GET_ENGSTS_IN_SLEEP

/** 
 * @brief To support ID Adsjustment for clor model.
 */ 
#undef PRNDEF_SUPPORT_ID_ADJUSTMENT

/** 
 * @brief When toner remaining is reached to 0%, engine will block the CTD opreation.
 */ 
#undef PRNDEF_TONER_ZERO_REMAIN_CONTROL

/** 
 * @brief To debug performace of emulation.
 */ 
#undef EMULATION_PERFORMANCE_CHECK

/** 
 * @brief All-in-one and separated types are supported in same model series. (ex, Kingbird-N)
 */ 
#define PRNDEF_SUPPORT_SEPARATED_TYPE

/** 
 * @brief In case of saving counter to serial flash. (ex. M2020-A1000)
 */ 
#undef FR_PRN_CNT_SFLASH_BACKUP

/** 
 * @brief To support alteration of stopping imaging unit using report.
 */ 
#define PRNDEF_SUPPORT_IMGUNIT_STOP_ALERT_REPORT

/** 
 * @brief To support engine I/F v3
 */ 
#undef FR_PRN_ENGINE_IF_V3

/** 
 * @brief To support engine I/F v4(This should be defined with FR_PRN_ENGINE_IF_V3 always.)
 */ 
#undef FR_PRN_ENGINE_IF_V4

/** 
 * @brief To support IPMQ(Inter Process Message Queue)
 */ 
#undef FR_PRN_SUPPORT_IPMQ

/** 
 * @brief To support ISR rendering.
 */ 
#undef FR_PRN_ISR_RENDERING

/** 
 * @brief To support page control v2.
 */ 
#undef FR_PRN_PAGECTRL_V2

/** 
 * @brief To support fast pick up.(To use this define, FR_PRN_PAGECTRL_V2 should be defined)
 */ 
#undef FR_PRN_PAGECTRL_V2_FASTPICKUP

/** 
 * @brief To support fast duplex.(To use this define, FR_PRN_PAGECTRL_V2 should be defined)
 */ 
#undef FR_PRN_PAGECTRL_V2_FASTDUPLEX

/** 
 * @brief Smart duplex apply to only 1page per 1 job for SEC . But xerox sepcification is smart duplex apply to all job.
 */ 
#undef PRNDEF_SUPPORT_EXTENDED_SMART_DUPLEX

/** 
 * @brief 
 */ 
#undef PRNDEF_MAA_CRYPTO_WRITE

/** 
 * @brief 
 */ 
#undef HPVC_HCT_OTF

/** 
 * @brief 
 */ 
#undef PRNDEF_COLOR_DENSITY

/** 
 * @brief 
 */ 
#undef FR_BLOCK_DUAL_JOB_WITH_MEMORY_SHORTAGE

/** 
 * @brief 
 */ 
#undef PRNDEF_JOB_RESCHEDULE

/** 
 * @brief 
 */ 
#undef PRN_PAPER_SUBSTITUTION

/** 
 * @brief 
 */ 
#undef PRNDEF_TANDEM_DUPLEXBIND_MARGIN

/** 
 * @brief 
 */ 
#undef PRNDEF_SUPPORT_REVERSEUNIT

/** 
 * @brief 
 */ 
#undef FR_VIDEO_CTD

/** 
 * @brief 
 */ 
#undef PRNDEF_SUPPORT_EDC

/** 
 * @brief 
 */ 
#undef PRNDEF_PAGECTRL_BUFFER_SCHEDULER

/** 
 * @brief 
 */ 
#undef PRNDEF_CONNETED_CRUM_TYPE

/** 
 * @brief 
 */ 
#undef PRNDEF_ISR_RENDERING

/** 
 * @brief 
 */ 
#undef PRNDEF_SUPPORT_TRAY_EMPTY_ERROR_CODE_POLICY

/** 
 * @brief 
 */ 
#undef PRNDEF_K2200_FUSER_JIG

/** 
 * @brief 
 */ 
#undef PRNDEF_FOOTER_WO_FNTMAKER

/** 
 * @brief 
 */ 
#undef GV3_DEV_CRUM_JIG

/** 
 * @brief 
 */ 
#undef FR_PRN_XEROX_SFO

/** 
 * @brief 
 */ 
#undef FR_PRN_XEROX_PAPER_COLOR

/** 
 * @brief 
 */ 
#undef FR_PRN_XEROX_COPY_AUTO_PAPER_SELECTION



/***********************************************************************/
/*Define values                                                        */ 

/** 
 * @brief Cover Page function support
 */ 
#undef PRNDEF_SUPPORT_COVER

/** 
 * @brief RTC support
 */ 
#define RTC_SUPPORT

/** 
 * @brief Engine Stacking function support, in case of this mode, send engine's information
 */ 
#undef PRNDEF_SUPPORT_ENGINE_STACKING

/** 
 * @brief Manual Print support
 */ 
#define PRNDEF_SUPPORT_MANUALPRINT

/** 
 * @brief Duplex support
 */ 
#define DUPLEX_SUPPORT

/** 
 * @brief Counter support
 */ 
#define PRNDEF_SUPPORT_COUNTER

/** 
 * @brief ESCMS support
 */ 
#define PRNDEF_SUPPORT_ESCMS

/** 
 * @brief when HPVC Stub is Mono Only mode, Enable this definition
 */ 
#define PRNDEF_HPVC_MONO

/** 
 * @brief 300 dpi support
 */ 
#define PRNDEF_SUPPORT_300DPI

/** 
 * @brief using separated Engine Image.
 */ 
#define PRNDEF_SEPARATED_ENGINE_IMAGE

/** 
 * @brief engine controls power. ex> Enable:Kingbird  Disble:BlueMT
 */ 
#define PRNDEF_SUPPORT_KERNEL_POWERCONTROL

/** 
 * @brief Printer subsystem sends Empty Error state
 */ 
#define PRNDEF_SUPPORT_TRAY_EMPTY_ERROR

/** 
 * @brief 1 Page, 1 Job case, changing duplex job as Simplex job
 */ 
#define PRNDEF_SUPPORT_SMART_DUPLEX

/** 
 * @brief setting Video Ring Count by referring Video clock.
 */ 
#define PRNDEF_DYNAMIC_RING_SELECTION

/** 
 * @brief To support mismatch by paper size.
 */ 
#define PRNDEF_SUPPORT_SIZE_MISMATCH

/** 
 * @brief To support fast FPOT using "sleep to print" command.
 */ 
#define PRNDEF_SUPPORT_FAST_FPOT

/** 
 * @brief To support EDC(Engin Diagnostic Control)
 */ 
#define PRNDEF_ENGINE_DIAGNOSTIC_CONTROL

/** 
 * @brief In case of supporting EDC for 1byte LCD model
 */ 
#define PRNDEF_EDC_UI_1BYTE_LCD

/** 
 * @brief To support ESCMS 3.0
 */ 
#define PRNDEF_SUPPORT_ESCMS3

/** 
 * @brief To support saving margin sensing data of engine.
 */ 
#define PRNDEF_STANDARD_INTERFACE

/** 
 * @brief To support ES(Engin Simulator)
 */ 
#define PRNDEF_SUPPORT_ENGINE_SIMULATOR

/** 
 * @brief The type fo crum in toner cartridge(or Imaging unit) is zCrum.
 */ 
#define PRNDEF_CRUM_TYPE_ZCRUM

/** 
 * @brief Send to engine(BB_PRN_NVM_COLOR_DENSITY_K)
 */ 
#define PRNDEF_UNIFIED_DENSITY_CONTROL

/** 
 * @brief To support saving footer for MAA
 */ 
#define PRNDEF_SUPPORT_FOOTER_SAVE

/** 
 * @brief To use the CTS for margin.
 */ 
#undef PRNDEF_MARGIN_CTS

/** 
 * @brief To get target value of crum from FW not crum.
 */ 
#undef PRNDEF_CRU_TARGET_VALUE_FROM_FW

/** 
 * @brief To support tray confrim(by UI)
 */ 
#undef PRNDEF_SUPPORT_TRAY_CONFIRM_BY_UI

/** 
 * @brief RTC is supported.
 */ 
#undef PRNDEF_SUPPORT_ELAPSEDTIME_FOR_RTC

/** 
 * @brief For A3 machine
 */ 
#undef PRNDEF_A3_MACHINE

/** 
 * @brief To support upgrading F/W of trays.
 */ 
#undef PRNDEF_OPTIONAL_TRAYS_FW_UPGRADE

/** 
 * @brief To notify changed tray status(opened or closed) to UI.
 */ 
#define PRNDEF_SUPPORT_TRAY_CLOSED_OPTION

/** 
 * @brief To support auto tray switching
 */ 
#define PRNDEF_CONTINOUS_PRINTING_ON_TRAYSWITCHING

/** 
 * @brief To notify installed status to UI.
 */ 
#define PRNDEF_TRAY_INFO_PREPARED

/** 
 * @brief To support tray protection.
 */ 
#define PRNDEF_SUPPORT_TRAY_PROTECTION

/** 
 * @brief To write engine data to NVM memory.
 */ 
#undef PRNDEF_SUPPORT_ENGINE_DATA_BACKUP

/** 
 * @brief To support two component development.
 */ 
#define PRNDEF_TONER_TWO_COMPONENT_DEVELOPER

/** 
 * @brief To send pre-print command to engine for FCOT
 */ 
#define PRNDEF_SUPPORT_FCOT_BY_PRESTART

/** 
 * @brief In case of paper size mismatch(size is same but feeding direction is different), mismatch will be occurred.
 */ 
#undef PRNDEF_SUPPORT_MISMATCH_FOR_DIFF_EDGEFEED

/** 
 * @brief To not support "sleep to print" command for multiple tray
 */ 
#define PRNDEF_USE_MULTIPLE_TRAY

/** 
 * @brief To support real 1200 dpi printing.
 */ 
#define PRNDEF_SUPPORT_REAL_1200

/** 
 * @brief To support auto clear of machine count, when count is 0xFFFFFFFF. Only for debug mode.
 */ 
#define PRNDEF_SUPPORT_AUTO_CLEAR_MACHINECNT

/** 
 * @brief To support xerox strategy of supplies.
 */ 
#undef FR_PRN_XEROX_SUPPLY_STRATEGY

/** 
 * @brief 
 */ 
#define PRNDEF_4LEVEL_ALTITUDE

/** 
 * @brief 
 */ 
#define PRNDEF_MONO_PASS

/** 
 * @brief 
 */ 
#define PRN_ENG_MARGIN

/** 
 * @brief 
 */ 
#define PRNDEF_USE_TEMP_ENGBRDG

/** 
 * @brief 
 */ 
#define FR_ONLY_USE_STANDARD_UNIT_MILLIMETER

/** 
 * @brief 
 */ 
#define PRNDEF_STD_MARGINMENU

/** 
 * @brief 
 */ 
#define PRNDEF_SLEEP_TO_PRINT

/** 
 * @brief 
 */ 
#define PRNDEF_SEPARATED_ENGINE_IF

/** 
 * @brief 
 */ 
#define PRNDEF_SUPPORT_PSM2

/** 
 * @brief 
 */ 
#define PRN_SUPPORT_EXTENDED_SUPPLIER

/** 
 * @brief 
 */ 
#define PRNDEF_CRUM_TYPE_ACRUM

/** 
 * @brief 
 */ 
#define FR_ENGINE_ROM_SEPERATE

/** 
 * @brief 
 */ 
#undef PRNDEF_NOTSUPPORT_CRU_HARDSTOP

/** 
 * @brief 
 */ 
#undef FR_PRN_NOT_SUPPORT_CRU_SUPPLYINDEX

/** 
 * @brief 
 */ 
#undef FR_PRN_SUPPORT_TONER_SENSING

/** 
 * @brief 
 */ 
#define PRNDEF_PLAIN_PRIORITY_IN_AUTOTRAY_DEFAULT_TYPE

/** 
 * @brief 
 */ 
#define PRNDEF_DO_NOT_USE_SEPARATED_OPC_IN_COLOR_MULTI_PASS

/** 
 * @brief 
 */ 
#define PRNDEF_SUPPORT_SKIP_BLANKPAGE

/** 
 * @brief 
 */ 
#undef FR_PRN_XEROX_BYPASS_MODE

/** 
 * @brief 
 */ 
#define FR_PRN_XEROX_TRAY_PRORITY

/** 
 * @brief 
 */ 
#define FR_PRN_XEROX_LETTERHEAD_DUPLEX

/** 
 * @brief 
 */ 
#define FR_PRN_XEROX_FORCE_DISABLE_AUTO_CONTINUE

/** 
 * @brief 
 */ 
#define FR_PRN_XEROX_TOLERANCE_VALUE

/** 
 * @brief 
 */ 
#define FR_PRN_THE_WAY_TO_MANAGE_MEMCLEAR_BY_SRIB

/** 
 * @brief Xerox counters for ramona project
 */ 
#define FR_PRN_XEROX_COUNTERS

/** 
 * @brief Sensor absent
 */ 
#define FR_PRN_ELEBATING_SENSOR_ABSENT

/** 
 * @brief Support Color Mismatch in tray
 */ 
#define PRNDEF_SUPPORT_COLOR_MISMATCH

/** 
 * @brief Xerox Tray Handling Requirement
 */ 
#define XEROX_TRAY_HANDLING

/** 
 * @brief Xerox default values during memory clear
 */ 
#define FR_PRN_XEROX_DEFAULT_VALUES

/** 
 * @brief IDPT 3.0 support
 */ 
#define FR_PRN_SUPPORT_3RD_GENERATION_MAA

/** 
 * @brief Cover Page fix
 */ 
#define FR_PRN_XEROX_COVER

/** 
 * @brief B-CRUM support. A-CRUM should be defined along with this
 */ 
#define PRNDEF_CRUM_TYPE_BCRUM

/** 
 * @brief Engine log backup
 */ 
#undef FR_PRN_SUPPORT_ENG_LOG_BACKUP

#ifdef WIN32
#define PRNDEF_DEV_TONER_NOT_INSTALLED_WOCHECK
#endif

/** 
 * @brief Enable Interrupt and Stop Pause support in Page control component to pause lates page submitted to eng sync
 */ 
#define FR_PRN_SUPPORT_PAGECTRL_PAUSE_INTERRUPT

/** 
 * @brief Counter support for last 30 days
 */ 
#define FR_PRN_30DAYS_COUNTER

/** 
 * @brief Dynamic Rotation Issue Fix
 */ 
#define FR_PRN_ROTATION_ISSUE_FIX_FOR_DUPLEX

/** 
 * @brief Dynamic Rotation
 */ 
#define FR_PRN_DYNAMIC_ROTATE

/** 
 * @brief Block Rotation for Copy Jobs
 */ 
#define FR_PRN_ROTATION_NOT_SUPPORTED_FOR_COPYJOB

/** 
 * @brief Support  Bypass tray confirmation bit restoration
 */ 
#define FR_PRN_BYPASS_TRAY_CONFIRMATION_RESTORE

/** 
 * @brief  Check Duplex support for paper type and size combination
 */ 
#define FR_PRN_SUPPORT_DUPLEX_PAPERTYPE_PAPERSIZE_COMBINATION

/** 
 * @brief Support OPC part replacement alert (Low and empty) ON/OFF setting
 */ 
#define FR_PRN_PARTREPLACEMENTALERT_IMGUNIT

/** 
 * @brief Support handling for cases where Imt has no memory to perform rotation and hence will return failure, in such cases the page is printed as is without rotation and cropping is expected.
 */ 
#define FR_PRN_ROTATION_FAILURE_HANDLING

/** 
 * @brief Support FR_PRN_CRU_GPIO_CONTROL
 */
#define FR_PRN_CRU_GPIO_CONTROL

#endif /* __PRNCM_FEATURECONFIG_H__ */

/* End of File */

