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
 * @brief Crypto Write 지원
 */ 
#undef PRNDEF_MAA_CRYPTO_WRITE

/** 
 * @brief Color Single Pass 기능 지원
 */ 
#undef PRNDEF_COLOR_SINGLE_PASS

/** 
 * @brief Color Multi Pass 기능 지원
 */ 
#undef COLOR_MULTI_PASS

/** 
 * @brief Cross-Scan (Color Single Pass 모델에서만 사용)
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
 * @brief Manual Duplex 지원
 */ 
#undef PRNDEF_SUPPORT_MANUALDUPLEX

/** 
 * @brief UI에서 color별 density 값 주는 기능
 */ 
#undef PRNDEF_COLOR_DENSITY

/** 
 * @brief Memory 부족시 Dual Job 들어가지 않도록 하는 기능
 */ 
#undef FR_BLOCK_DUAL_JOB_WITH_MEMORY_SHORTAGE

/** 
 * @brief (mismatch시) Job Rescheduling 기능 지원
 */ 
#undef PRNDEF_JOB_RESCHEDULE

/** 
 * @brief Cover Page 기능 지원
 */ 
#undef PRNDEF_SUPPORT_COVER

/** 
 * @brief Paper 대체기능이 적용되어 A4<->Ltr간에 호환성을 두는 경우.
 */ 
#undef PRN_PAPER_SUBSTITUTION

/** 
 * @brief Contone RGB data 출력시 정의 (UTE only)
 */ 
#undef PRNDEF_CONTONE

/** 
 * @brief Tandem 방식의 모델에서 Duplex Binding Margin Tuning 기능
 */ 
#undef PRNDEF_TANDEM_DUPLEXBIND_MARGIN

/** 
 * @brief Paper Exit 시 Reverse Path 존재하는 모델 (Lily계열)
 */ 
#undef PRNDEF_SUPPORT_REVERSEUNIT

/** 
 * @brief Video CTD 지원
 */ 
#undef FR_VIDEO_CTD

/** 
 * @brief RTC 지원모델
 */ 
#define RTC_SUPPORT

/** 
 * @brief Engine Stacking 기능 지원, 해당 mode 인 경우 엔진에 정보를 제공한다.
 */ 
#undef PRNDEF_SUPPORT_ENGINE_STACKING

/** 
 * @brief EDC 지원
 */ 
#undef PRNDEF_SUPPORT_EDC

/** 
 * @brief LSU Reverse Scan Direction 지원
 */ 
#undef PRNDEF_SUPPORT_LSU_REVSCAN



/***********************************************************************/
/*Define values                                                        */ 

/** 
 * @brief 4 Level Altitude 기능
 */ 
#define PRNDEF_4LEVEL_ALTITUDE

/** 
 * @brief Engine Tech 모드에서 마진 설정하는 기능
 */ 
#define PRN_ENG_MARGIN

/** 
 * @brief Manual Print 지원
 */ 
#define PRNDEF_SUPPORT_MANUALPRINT

/** 
 * @brief Duplex 기능
 */ 
#define DUPLEX_SUPPORT

/** 
 * @brief Counter 지원여부
 */ 
#define PRNDEF_SUPPORT_COUNTER

/** 
 * @brief UI가 아니라 Engine(Tray)상태만 보고 confirm 처리하는 기능
 */ 
#define PRNDEF_SUPPORT_TRAY_CONFIRM_BY_ENGINE

/** 
 * @brief Old Engine FW를 사용할 경우 New Interface와의 Temporary Bridge를 사용함. 추후 제거
 */ 
#define PRNDEF_USE_TEMP_ENGBRDG

/** 
 * @brief Margin 설정에서 기준 단위를 milimeter로 설정
 */ 
#define FR_ONLY_USE_STANDARD_UNIT_MILLIMETER

/** 
 * @brief ESCMS 지원모델
 */ 
#define PRNDEF_SUPPORT_ESCMS
#define PRNDEF_SUPPORT_ESCMS3

/** 
 * @brief HPVC Stub이 Mono Only 모드이면 Enable 시킨다.
 */ 
#define PRNDEF_HPVC_MONO

/** 
 * @brief 300 dpi 지원
 */ 
#define PRNDEF_SUPPORT_300DPI

/** 
 * @brief 분리형 Engine Image 사용
 */ 
#define PRNDEF_SEPARATED_ENGINE_IMAGE

/** 
 * @brief Standard margin SRD에 의한 margin 설정 기능
 */ 
#define PRNDEF_STD_MARGINMENU

/** 
 * @brief HPVC Dual Beam Mode
 */ 
#define HPVC_DUAL_BEAM

/** 
 * @brief engine에서 power control을 하는 경우. ex> Enable:Kingbird  Disble:BlueMT
 */ 
#define PRNDEF_SUPPORT_KERNEL_POWERCONTROL

/** 
 * @brief Tray의 Empty Error상태를 Printer에서 확인해서 올려주도록 함
 */ 
#define PRNDEF_SUPPORT_TRAY_EMPTY_ERROR

/** 
 * @brief MP대신에 Manual Feeder를 지원하는 모델인 경우 설정함
 */ 
#define PRNDEF_SUPPORT_MANUAL_FEEDER_TRAY

/** 
 * @brief Sleep To Print 기능을 지원하는 engine에서 사용 가능함
 */ 
#define PRNDEF_SLEEP_TO_PRINT

/** 
 * @brief 1 Page가 1 Job인 경우에는 Duplex를 Simplex로 출력함
 */ 
#define PRNDEF_SUPPORT_SMART_DUPLEX

/** 
 * @brief 
 */ 
#define PRNDEF_SEPARATED_ENGINE_IF

/** 
 * @brief PSM version2를 지원함
 */ 
#define PRNDEF_SUPPORT_PSM2

/** 
 * @brief Video Ring Count를 Engine의 Video clock을 참조하여 설정함
 */ 
#define PRNDEF_DYNAMIC_RING_SELECTION

/** 
 * @brief Video Beam Mode를 Engine에서 설정하는 Mode를 읽어서 PVC를 설정하도록 함.(Engine의 선속에 따라서 변경하는 경우가 있음.)
 */ 
#define PRNDEF_DYNAMIC_BEAMMODE_SELECTION

#ifdef WIN32
#define PRNDEF_DEV_TONER_NOT_INSTALLED_WOCHECK	/* 초기 개발시 Toner Not Installed상태로 만들고 Crum Access를 막기 위함임. */
#else
#undef PRNDEF_DEV_TONER_NOT_INSTALLED_WOCHECK	/* 초기 개발시 Toner Not Installed상태로 만들고 Crum Access를 막기 위함임. */
#endif

#define PRNDEF_SUPPORT_SIZE_MISMATCH

#undef PRNDEF_SUPPORT_NEW_FONTMAKER			/* Reder Footer uses New Font Maker */

#define PRNDEF_SUPPORT_FAST_FPOT

#undef PRNDEF_SUPPORT_PROGRESSBAR
/** 
 * @brief EDC를 지원하기 위한 설정들
 */ 
#define PRNDEF_ENGINE_DIAGNOSTIC_CONTROL
#define FR_ENGINE_ROM_SEPERATE

/** 
 * @brief 1byte LCD UI일 경우 사용함.
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

