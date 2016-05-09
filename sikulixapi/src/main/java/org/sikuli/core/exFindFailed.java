/*
 * Copyright (c) 2016 - sikulix.com - MIT license
 */
package org.sikuli.core;

/**
 * implements the SikuliX FindFailed exception class
 * and defines constants and settings for the feature FindFailedResponse
 */
public class ExFindFailed extends SikuliException {

  /**
   * default FindFailedResponse is ABORT
   */
  public static FindFailedResponse defaultFindFailedResponse = FindFailedResponse.ABORT;

  /**
   * FindFailedResponse: should display a prompt dialog with the failing image
   * having the options retry, skip and abort
   */
  public static final FindFailedResponse PROMPT = FindFailedResponse.PROMPT;

  /**
   * FindFailedResponse: should retry the find op on FindFailed
   */
  public static final FindFailedResponse RETRY = FindFailedResponse.RETRY;

  /**
   * FindFailedResponse: should silently continue on FindFailed
   */
  public static final FindFailedResponse SKIP = FindFailedResponse.SKIP;

  /**
   * FindFailedResponse: should abort the SikuliX application
   */
  public static final FindFailedResponse ABORT = FindFailedResponse.ABORT;

  /**
   * the exception
   *
   * @param message to be shown
   */
  public ExFindFailed(String message) {
    super(message);
    _name = "FindFailed";
  }
}