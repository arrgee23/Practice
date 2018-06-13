/**
 * @file        RipCM_FeatureConfig.h (Ramona_L)
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
 * @date        2/5/2018(Y-M-D)
 * @version     
 */
/***********************************************************************/

/*Undefine values                                                      */ 

/** 
 * @brief Color Model suuport
 */ 
#undef RIPDEF_SUPPORT_COLOR_EMUL

/** 
 * @brief Using emulation needed by RAM loading
 */ 
#undef RIPDEF_EMULATION_WHENNEED_IN_RAM

/** 
 * @brief loading all emulations to RAM
 */ 
#undef RIPDEF_ALL_EMULATION_IN_RAM

/** 
 * @brief PS(PDF,XPS) support (use RIP_ADDR_FIX)
 */ 
#undef RIPDEF_SUPPORT_PS

/** 
 * @brief Smart CMS support
 */ 
#undef RIPDEF_SUPPORT_SMART_CMS

/** 
 * @brief Form Overlay support
 */ 
#undef RIPDEF_SUPPORT_OVERLAY

/** 
 * @brief when printer data is PS format, machine set retention as 'on' state after page CheckIn
 */ 
#undef JSDEF_JRET

/** 
 * @brief when HCT compression process machine compress as reverse direction
 */ 
#undef RIPDEF_SUPPORT_REVERSE_COMPRESSION

/** 
 * @brief HW HCT support 
 */ 
#undef RIPDEF_HW_HCT_SUPPORT

/** 
 * @brief HW GEU support
 */ 
#undef RIPDEF_HW_GEU_SUPPORT

/** 
 * @brief SW HCT support
 */ 
#undef RIPDEF_SW_HCT_SUPPORT

/** 
 * @brief Interrupt Print support 
 */ 
#undef RIPDEF_INTERRUPT_PRINTING

/** 
 * @brief Landscape Stapling support
 */ 
#undef RIPDEF_LANDSCAPE_STAPLE

/** 
 * @brief select paper type by size
 */ 
#undef RIPDEF_SUPPORT_PAPERTYPE_FIX_BY_SIZE

/** 
 * @brief Unit Test support
 */ 
#undef RIPDEF_UT

/** 
 * @brief 
 */ 
#undef RIPDEF_KCCALL_PARAM_TEMP

/** 
 * @brief 
 */ 
#undef RIPDEF_HCT_SUPPORT

/** 
 * @brief CSC driver support (Only Target, #ifndef WIN32 in UTE)
 */ 
#undef RIPDEF_SUPPORT_CSC

/** 
 * @brief UCR driver support (Only Target, #ifndef WIN32 in UTE)
 */ 
#undef RIPDEF_SUPPORT_UCR

/** 
 * @brief HDD support
 */ 
#undef RIPDEF_SUPPORT_HDD

/** 
 * @brief using SFLASH and ZIP compression
 */ 
#undef RIPDEF_SFLASH_ZIP_EMUL

/** 
 * @brief XHTML support in AutoParser
 */ 
#undef SYS_SUPPORT_XHTML_EMUL

/** 
 * @brief 
 */ 
#undef RIPDEF_ALICE_SUPPORT

/** 
 * @brief PCL5 support only use of report
 */ 
#undef RIPDEF_SUPPORT_PCL5E_FOR_REPORT

/** 
 * @brief 
 */ 
#undef RIPDEF_DUPLEX_SUPPORT_IN_PAGECTRL

/** 
 * @brief 
 */ 
#undef FR_RIP_XEROX_SFO

/** 
 * @brief Defined to Block ReParsing Feature
 */ 
#undef FR_RIP_REMOVE_REPARSING_SUPPORT



/***********************************************************************/
/*Define values                                                        */ 

/** 
 * @brief PCLXL(PCL6) support (use RIP_ADDR_FIX)
 */ 
#define RIPDEF_SUPPORT_PCLXL

/** 
 * @brief PCL5E(PCL5CE) support (use RIP_ADDR_FIX)
 */ 
#define RIPDEF_SUPPORT_PCL5E

/** 
 * @brief SPL(SPLC) support (use RIP_ADDR_FIX)
 */ 
#define RIPDEF_SUPPORT_SPL

/** 
 * @brief XPI Emulation support
 */ 
#define RIPDEF_SUPPORT_XPI

/** 
 * @brief set UEV(environmental variables) initialization
 */ 
#define RIPDEF_MFP_UEVSETTING

/** 
 * @brief Font Management Unit support
 */ 
#define RIPDEF_FMU_SUPPORT

/** 
 * @brief SW GEU support
 */ 
#define RIPDEF_SW_GEU_SUPPORT

/** 
 * @brief Emulation Debug Message support
 */ 
#define RIPDEF_EMULATION_DEBUG_SERIAL

/** 
 * @brief Checking emulation's performance
 */ 
#define EMULATION_PERFORMANCE_CHECK

/** 
 * @brief Checking Memory Clean end
 */ 
#define RIPDEF_DBG_CLEANUP

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
 * @brief Object Based Halftone Table support
 */ 
#define RIPDEF_OBJECT_BASED_HALFTONE_TABLE

/** 
 * @brief applying the screen option on using user's table in ESCMS2.0
 */ 
#define FR_SCREEN

/** 
 * @brief AutoParser support
 */ 
#define RIPDEF_SUPPORT_AUTOPARSER

/** 
 * @brief Permanent Font/Macro/Symbol support
 */ 
#define RIPDEF_SUPPORT_PERM_BLOCK

/** 
 * @brief When in low-cost model, insufficient heap memory for processing SPL codec, Rip allocates memory in case of Rip State 
 */ 
#define RIPDEF_SUPPORT_SPL_DEC_ALLOCMEM

/** 
 * @brief do not change unit in inch because it support in mm
 */ 
#define FR_ONLY_USE_STANDARD_UNIT_MILLIMETER

/** 
 * @brief PCL5 support in AutoParser
 */ 
#define SYS_SUPPORT_PCL5_EMUL

/** 
 * @brief for printing frame ass'y jig pattern in BlueMT project
 */ 
#define RIPDEF_FRAME_ASSY_JIG

/** 
 * @brief DLNA support (Con Function Call Routine added)
 */ 
#define RIPDEF_SUPPORT_DLNA

/** 
 * @brief when page direction is LEF, change edge bit, reverse image
 */ 
#define RIPDEF_DPLXREVERSE_AUTOSET

/** 
 * @brief ESCMS initial version support
 */ 
#define RIPDEF_SUPPORT_ESCMS

/** 
 * @brief ESCMS 3.0 version support
 */ 
#define RIPDEF_SUPPORT_ESCMS30

/** 
 * @brief Object Baseed CMS support
 */ 
#define RIPDEF_OBJECT_BASED_CMS

/** 
 * @brief Fast FPOT support by Coverage, Object Info, Font Size
 */ 
#define RIPDEF_SUPPORT_FAST_FPOT

/** 
 * @brief Skip Blank page support
 */ 
#define RIPDEF_SUPPORT_SKIP_BLANKPAGE

/** 
 * @brief deciding resolution info by resolution pjl and multi bit pjl
 */ 
#define RIPDEF_SUPPORT_MAPPING_GRAPHIC_RESOLUTION

/** 
 * @brief 
 */ 
#define RIPDEF_SUPPORT_A3_MACHINE

/** 
 * @brief QPDL PC print jobs are rotated after page checkin when actual paper size in tray is loaded in different orientation
 */ 
#define RIPDEF_SUPPORT_CHECK_ROTATE_CONDITION

/** 
 * @brief Support XCPT(Xerox Common Print Ticket) which uses as a job attirubtes instead of PJL
 */ 
#define FR_RIP_XEROX_XCPT

/** 
 * @brief Product name for PS Font list printing
 */ 
#define FR_RIP_XEROX_PRODUCT_NAME

/** 
 * @brief PCLm support for Mopria Print
 */ 
#define RIPDEF_SUPPORT_PCLM

/** 
 * @brief PDF support
 */ 
#define FR_PDF_EMUL_SUPPORT

/** 
 * @brief Reset Emul Default PaperType with System Default Paper Type
 */ 
#define RIPDEF_XRX_DEFAULT_PAPERTYPE

/** 
 * @brief Rotate 90 Degree to be in Synch with Banner Page Orientation
 */ 
#define RIPDEF_XRX_ROTATE_DEGREE_90_LEF


/* End of File */

