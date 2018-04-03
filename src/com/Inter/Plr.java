package com.Inter;

public class Plr 
{
	#include<stdio.h>
	#include<stdlib.h>

	int len[4];
	int maxlen;
	int temp[4];
	int main()
	{
	int i;
	int arr[]={54,546,548,60};

	maxlen=getmaxdigits(arr);

	appendall(arr);
	printf("maxlen is %d \n",maxlen );
	for(i=0;i<4;i++)
	printf("%d ",temp[i] );
	printf("\n");

	for(i=0;i<4;i++)
	printf("%d ",arr[i] );
	printf("\n");

	}

	getmaxdigits(int*arr)
	{
	int i,factor,count,max=-99;

	for(i=0;i<4;i++)
	{
	count=0;

	factor=1;

	while(arr[i]/factor)
	{
	count++;
	factor=factor*10;
	}

	l
}
