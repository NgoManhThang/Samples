//
//This sample program is provided AS IS and may be used, executed, copied and
//modified without royalty payment by customer (a) for its own instruction and 
//study, (b) in order to develop applications designed to run with an IBM 
//WebSphere product, either for customer's own internal use or for redistribution 
//by customer, as part of such an application, in customer's own products. "
//
//5724-J34 (C) COPYRIGHT International Business Machines Corp. 2005
//All Rights Reserved * Licensed Materials - Property of IBM
//
package com.devwebsphere.wxsutils;

/**
 * This is the type of eviction required for a data structure.
 * @author bnewport
 *
 */
@Beta
public enum EvictionType 
{ 
	/**
	 * This is an interval since the item was marked for eviction
	 */
	FIXED, 
	/**
	 * This is an interval since the item was last accessed
	 */
	LAST_ACCESS_TIME, 
	/**
	 * This is no eviction
	 */
	NONE 
}