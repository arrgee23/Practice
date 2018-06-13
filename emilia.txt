/**
 * @file        PrnCM_FeatureConfig.h (Batian)
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
 * @date        2011-01-17(Y-M-D)
 * @version     
 */
/***********************************************************************/
#ifndef __PRNCM_FEATURECONFIG_H__
#define __PRNCM_FEATURECONFIG_H__

/*Undefine values                                                      */ 

/** 
 * @brief Crypto Write ??
 */ 
#undef PRNDEF_MAA_CRYPTO_WRITE

/** 
 * @brief Color Single Pass ?? ??
 */ 
#undef PRNDEF_COLOR_SINGLE_PASS

/** 
 * @brief Color Multi Pass ?? ??
 */ 
#undef COLOR_MULTI_PASS

/** 
 * @brief Cross-Scan (Color Single Pass ????? ??)
 */ 
#undef HPVC_CROSS_SCAN

/** 
 * @brief HCT OTF Printing
 */ 
#undef HPVC_HCT_OTF

/** 
 * @brief JBIG OTF Printing
 */ 
#undef HPVC_JBIG_OTF

/** 
 * @brief Manual Duplex ??
 */ 
#undef PRNDEF_SUPPORT_MANUALDUPLEX

/** 
 * @brief UI?? color? density ? ?? ??
 */ 
#undef PRNDEF_COLOR_DENSITY

/** 
 * @brief Memory ??? Dual Job ???? ??? ?? ??
 */ 
#undef FR_BLOCK_DUAL_JOB_WITH_MEMORY_SHORTAGE

/** 
 * @brief (mismatch?) Job Rescheduling ?? ??
 */ 
#undef PRNDEF_JOB_RESCHEDULE

/** 
 * @brief Cover Page ?? ??
 */ 
#undef PRNDEF_SUPPORT_COVER

/** 
 * @brief Paper ????? ???? A4<->Ltr?? ???? ?? ??.
 */ 
#undef PRN_PAPER_SUBSTITUTION

/** 
 * @brief Contone RGB data ??? ?? (UTE only)
 */ 
#undef PRNDEF_CONTONE

/** 
 * @brief Tandem ??? ???? Duplex Binding Margin Tuning ??
 */ 
#undef PRNDEF_TANDEM_DUPLEXBIND_MARGIN

/** 
 * @brief Paper Exit ? Reverse Path ???? ?? (Lily??)
 */ 
#undef PRNDEF_SUPPORT_REVERSEUNIT

/** 
 * @brief Video CTD ??
 */ 
#undef FR_VIDEO_CTD

/** 
 * @brief RTC ????
 */ 
#define RTC_SUPPORT

/** 
 * @brief Engine Stacking ?? ??, ?? mode ? ?? ??? ??? ????.
 */ 
#undef PRNDEF_SUPPORT_ENGINE_STACKING

/** 
 * @brief EDC ??
 */ 
#undef PRNDEF_SUPPORT_EDC

/** 
 * @brief LSU Reverse Scan Direction ??
 */ 
#undef PRNDEF_SUPPORT_LSU_REVSCAN



/***********************************************************************/
/*Define values                                                        */ 

/** 
 * @brief 4 Level Altitude ??
 */ 
#define PRNDEF_4LEVEL_ALTITUDE

/** 
 * @brief Engine Tech ???? ?? ???? ??
 */ 
#define PRN_ENG_MARGIN

/** 
 * @brief Manual Print ??
 */ 
#define PRNDEF_SUPPORT_MANUALPRINT

/** 
 * @brief Duplex ??
 */ 
#define DUPLEX_SUPPORT

/** 
 * @brief Counter ????
 */ 
#define PRNDEF_SUPPORT_COUNTER

/** 
 * @brief UI? ??? Engine(Tray)??? ?? confirm ???? ??
 */ 
#define PRNDEF_SUPPORT_TRAY_CONFIRM_BY_ENGINE

/** 
 * @brief Old Engine FW? ??? ?? New Interface?? Temporary Bridge? ???. ?? ??
 */ 
#define PRNDEF_USE_TEMP_ENGBRDG

/** 
 * @brief Margin ???? ?? ??? milimeter? ??
 */ 
#define FR_ONLY_USE_STANDARD_UNIT_MILLIMETER

/** 
 * @brief ESCMS ????
 */ 
#define PRNDEF_SUPPORT_ESCMS
#define PRNDEF_SUPPORT_ESCMS3

/** 
 * @brief HPVC Stub? Mono Only ???? Enable ???.
 */ 
#define PRNDEF_HPVC_MONO

/** 
 * @brief 300 dpi ??
 */ 
#define PRNDEF_SUPPORT_300DPI

/** 
 * @brief ??? Engine Image ??
 */ 
#define PRNDEF_SEPARATED_ENGINE_IMAGE

/** 
 * @brief Standard margin SRD? ?? margin ?? ??
 */ 
#define PRNDEF_STD_MARGINMENU

/** 
 * @brief HPVC Dual Beam Mode
 */ 
#define HPVC_DUAL_BEAM

/** 
 * @brief engine?? power control? ?? ??. ex> Enable:Kingbird  Disble:BlueMT
 */ 
#define PRNDEF_SUPPORT_KERNEL_POWERCONTROL

/** 
 * @brief Tray? Empty Error??? Printer?? ???? ????? ?
 */ 
#define PRNDEF_SUPPORT_TRAY_EMPTY_ERROR

/** 
 * @brief MP??? Manual Feeder? ???? ??? ?? ???
 */ 
#define PRNDEF_SUPPORT_MANUAL_FEEDER_TRAY

/** 
 * @brief Sleep To Print ??? ???? engine?? ?? ???
 */ 
#define PRNDEF_SLEEP_TO_PRINT

/** 
 * @brief 1 Page? 1 Job? ???? Duplex? Simplex? ???
 */ 
#define PRNDEF_SUPPORT_SMART_DUPLEX

/** 
 * @brief 
 */ 
#define PRNDEF_SEPARATED_ENGINE_IF

/** 
 * @brief PSM version2? ???
 */ 
#define PRNDEF_SUPPORT_PSM2

/** 
 * @brief Video Ring Count? Engine? Video clock? ???? ???
 */ 
#define PRNDEF_DYNAMIC_RING_SELECTION

/** 
 * @brief Video Beam Mode? Engine?? ???? Mode? ??? PVC? ????? ?.(Engine? ??? ??? ???? ??? ??.)
 */ 
#define PRNDEF_DYNAMIC_BEAMMODE_SELECTION

#ifdef WIN32
#define PRNDEF_DEV_TONER_NOT_INSTALLED_WOCHECK	/* ?? ??? Toner Not Installed??? ??? Crum Access? ?? ???. */
#else
#undef PRNDEF_DEV_TONER_NOT_INSTALLED_WOCHECK	/* ?? ??? Toner Not Installed??? ??? Crum Access? ?? ???. */
#endif

#define PRNDEF_SUPPORT_SIZE_MISMATCH

#undef PRNDEF_SUPPORT_NEW_FONTMAKER			/* Reder Footer uses New Font Maker */

#define PRNDEF_SUPPORT_FAST_FPOT

#undef PRNDEF_SUPPORT_PROGRESSBAR
/** 
 * @brief EDC? ???? ?? ???
 */ 
#define PRNDEF_ENGINE_DIAGNOSTIC_CONTROL
#define FR_ENGINE_ROM_SEPERATE

/** 
 * @brief 1byte LCD UI? ?? ???.
 */ 
#undef  PRNDEF_EDC_UI_LED 
#define PRNDEF_EDC_UI_1BYTE_LCD
#undef  PRNDEF_EDC_UI_MULTIBYTE_LCD

#define PRNDEF_SUPPORT_NOCHIP
#define PRN_SUPPORT_EXTENDED_SUPPLIER

#define PRNDEF_NCRUM3_BLACKLIST 

#define PRNDEF_STANDARD_INTERFACE
#define PRNDEF_SUPPORT_ENGINE_SIMULATOR

//#define PRNDEF_CRUM_TYPE_ZCRUM
#define PRNDEF_CRUM_TYPE_ACRUM
#undef PRNDEF_USE_FLASH_HIDDENBB

#define PRNDEF_UNIFIED_DENSITY_CONTROL

#define PRNDEF_SUPPORT_FOOTER_SAVE


#define PRNDEF_MISMATCH_PAPER_PROPERTY_USING_PCB	/* Enable In case of Auto Continue Option is OFF. In case of Mismatch, Printing Property follows PCB. if not, follows TRAY Property */

#undef PRNDEF_SUPPORT_FAST_ENGINE_BOOTUP

#define PRNDEF_OMIT_BAND_FOR_SHORT_PAGE_INTERVAL

#define PRNDEF_SUPPORT_INIT_MOTOR_OPERATION

#define PRNDEF_WA_ALTITUDE_HIGH4_ONLY_CHINA			/* for KB-N, HIGH4 Level (Altitude 5 step) only be available for China Model */

#define PRNDEF_SUPPORT_IMGUNIT_STOP_ALERT_REPORT

#define PRNDEF_SUPPORT_SEPARATED_TYPE

#define PRNDEF_PSEUDO1200_BINARY_SPL

#define FR_PRN_SUPPORT_3RD_GENERATION_MAA

#define FR_PRN_CRU_GPIO_CONTROL

#if defined(WIN32)	// No touch!
#undef PRNDEF_SUPPORT_TRAY_CONFIRM_BY_UI		// UTE Cannot set tray confirm
#undef PRNDEF_ENGINE_DIAGNOSTIC_CONTROL
#endif

#define FR_PRN_SUPPORT_TONER_EVENT_LOG

#define FR_PRN_SUPPORT_TRAY_MODE

#define FR_PRN_SUPPORT_SKIP_ENGINE_WARMUP

#endif /* __PRNCM_FEATURECONFIG_H__ */

/* End of File */

