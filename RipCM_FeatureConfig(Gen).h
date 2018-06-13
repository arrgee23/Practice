/**
 * @file        RipCM_FeatureConfig.h (BlueMTW)
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
 * @date        10-03-15(Y-M-D)
 * @version     
 */
/***********************************************************************/
#ifndef __RIPCM_FEATURECONFIG_H__
#define __RIPCM_FEATURECONFIG_H__

/*Undefine values                                                      */ 

/** 
 * @brief Color Model 여부
 */ 
#undef RIPDEF_SUPPORT_COLOR_EMUL

/** 
 * @brief 모든 Emulation을 RAM에 loading하여 사용
 */ 
#undef RIPDEF_ALL_EMULATION_IN_RAM



/** 
 * @brief PS(PDF,XPS)를 지원함 (RIP_ADDR_FIX와 함께 사용)
 */ 
#undef RIPDEF_SUPPORT_PS

/** 
 * @brief Smart CMS 사용
 */ 
#undef RIPDEF_SUPPORT_SMART_CMS

/** 
 * @brief Form Overlay 기능
 */ 
#undef RIPDEF_SUPPORT_OVERLAY

/** 
 * @brief Font Management Unit 기능
 */ 
#undef RIPDEF_FMU_SUPPORT

/** 
 * @brief Retention 관련 인쇄데이터가 PS format으로 올 경우 CheckIn후에 Retention 기능 On하는 기능
 */ 
#undef JSDEF_JRET

/** 
 * @brief HCT compression시 역방행으로 압축하도록 하는 기능
 */ 
#undef RIPDEF_SUPPORT_REVERSE_COMPRESSION

/** 
 * @brief HW GEU 기능 (추후 제거 : HW GEU 없음)
 */ 
#undef RIPDEF_HW_GEU_SUPPORT

/** 
 * @brief SW HCT 기능 (추후 제거 : Target은 무조건 HW, UTE는 무조건 SW)
 */ 
#undef RIPDEF_SW_HCT_SUPPORT

/** 
 * @brief Interrupt Print 기능 지원용 코드
 */ 
#undef RIPDEF_INTERRUPT_PRINTING

/** 
 * @brief Landscape Stapling 기능 지원용 코드
 */ 
#undef RIPDEF_LANDSCAPE_STAPLE

/** 
 * @brief Size당 가능한 Paper Type을 지정하는 기능
 */ 
#undef RIPDEF_SUPPORT_PAPERTYPE_FIX_BY_SIZE

/** 
 * @brief 각각의 function pointer를 ID화 하여, 각각의 address를 주도록 하는 방식 적용 (임시)
 */ 
#undef RIPDEF_KCCALL_PARAM_TEMP

/** 
 * @brief Object Based Halftone Table 적용
 */ 
#define RIPDEF_OBJECT_BASED_HALFTONE_TABLE

/** 
 * @brief ESCMS2.0에서 user custom table 적용시 screen option 반영 기능 추가
 */ 
#define FR_SCREEN

/** 
 * @brief CSC driver 사용지원 (Target에서만 사용함, UTE에서는 #ifndef WIN32로 묶임)
 */ 
#undef RIPDEF_SUPPORT_CSC

/** 
 * @brief UCR driver 사용지원 (Target에서만 사용함, UTE에서는 #ifndef WIN32로 묶임)
 */ 
#undef RIPDEF_SUPPORT_UCR

/** 
 * @brief HDD 지원하는 모델
 */ 
#undef RIPDEF_SUPPORT_HDD

/** 
 * @brief XPI Emulation 지원함
 */ 
#undef RIPDEF_SUPPORT_XPI


/** 
 * @brief EPSON Emulation 지원함
 */ 
#undef RIPDEF_SUPPORT_EPSON

/** 
 * @brief EPSON Emulation 지원함
 */ 
#undef RIPDEF_SUPPORT_PSIII

/***********************************************************************/
/*Define values                                                        */ 

/** 
 * @brief PCL5E(PCL5CE)를 지원함 (RIP_ADDR_FIX와 함께 사용)
 */ 
#define RIPDEF_SUPPORT_PCL5E

/** 
 * @brief SPL(SPLC)를 지원함 (RIP_ADDR_FIX와 함께 사용)
 */ 
#define RIPDEF_SUPPORT_SPL

/** 
 * @brief PCLXL(PCL6)를 지원함 (RIP_ADDR_FIX와 함께 사용)
 */ 
#define RIPDEF_SUPPORT_PCLXL

/** 
 * @brief 복합기용 UEV 초기화 설정
 */ 
#define RIPDEF_MFP_UEVSETTING

/** 
 * @brief HW HCT 기능 (추후 제거 : Target은 무조건 HW, UTE는 무조건 SW)
 */ 
#undef RIPDEF_HW_HCT_SUPPORT

/** 
 * @brief SW GEU 기능 (추후 제거 : HW GEU 없음)
 */ 
#define RIPDEF_SW_GEU_SUPPORT

/** 
 * @brief Emulation Debug Message 를 Enable 시킬 수 있는 기능
 */ 
#define RIPDEF_EMULATION_DEBUG_SERIAL

/** 
 * @brief Emualtion 속도측정기능
 */ 
#define EMULATION_PERFORMANCE_CHECK

/** 
 * @brief Memory Clean 됐는지 확인할 수 있는 디버그 메시지 ON
 */ 
#define RIPDEF_DBG_CLEANUP

/** 
 * @brief Unit Test 지원
 */ 
#undef RIPDEF_UT

/** 
 * @brief 
 */ 
#define RIPDEF_TEMP_REMOVE_DUPLEX_CHECK

/** 
 * @brief 
 */ 
#define RIPDEF_TEMP_REMOVE_CALL_PJL_FCN

/** 
 * @brief 
 */ 
#define RIPDEF_TEMP_SET_DEFAULT_BB

/** 
 * @brief 
 */ 
#undef RIPDEF_HCT_SUPPORT

/** 
 * @brief AutoParser 지원하는 모델
 */ 
#define RIPDEF_SUPPORT_AUTOPARSER

/** 
 * @brief Permanent Font/Macro/Symbol 지원
 */ 
#define RIPDEF_SUPPORT_PERM_BLOCK

/** 
 * @brief 
 */ 
#undef RIPDEF_SFLASH_ZIP_EMUL

/** 
 * @brief 저가 모델에서 HEAP 부족시, IMT내의 SPL Codec 처리용 메모리 부족할 경우, Rip에서 호출 case에 대해서는 Rip에서 alloc해서 호출함.
 */ 
#define RIPDEF_SUPPORT_SPL_DEC_ALLOCMEM

/** 
 * @brief 모든 Unit 단위를 mm 단위로 제공하므로, inch 단위로 변환하지 않도록 하는 기능 정의
 */ 
#define FR_ONLY_USE_STANDARD_UNIT_MILLIMETER

/** 
 * @brief AutoParser 에서 XHTML Print 지원
 */ 
#undef SYS_SUPPORT_XHTML_EMUL

/** 
 * @brief AutoParser 에서 PCL5 Print 지원
 */ 
#define SYS_SUPPORT_PCL5_EMUL

/** 
 * @brief BlueMT에서 Frame Assy JIG용 Pattern 인쇄목적으로 사용하는 Definition (======출력)
 */ 
#define RIPDEF_FRAME_ASSY_JIG

/** 
 * @brief DLNA 지원모델 (Con Function Call Routine 추가함)
 */ 
#define RIPDEF_SUPPORT_DLNA

/** 
 * @brief DPLX REVERSE AUTO SET(Set에서 Auto 설정)
 */ 
#define RIPDEF_DPLXREVERSE_AUTOSET


/* using ESCMS Table */
#define RIPDEF_SUPPORT_ESCMS
#define RIPDEF_SUPPORT_ESCMS30

/* using ESCMS Objected Table(get from Emul Team) */
#define RIPDEF_OBJECT_BASED_CMS


#define RIPDEF_ALICE_SUPPORT

#define RIPDEF_SUPPORT_FAST_FPOT


#define RIPDEF_SUPPORT_SKIP_BLANKPAGE

#define RIPDEF_SUPPORT_MAPPING_GRAPHIC_RESOLUTION

/** 
 * @brief PCLm를 지원함
 */ 
#define RIPDEF_SUPPORT_PCLM

#define FR_RIP_PSEUDO_1200_DPI_PRINTING

#define FR_RIP_SUPPORT_SFE
#endif /* __RIPCM_FEATURECONFIG_H__ */

/* End of File */

