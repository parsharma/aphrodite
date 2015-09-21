/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2015, Red Hat, Inc., and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.jboss.set.aphrodite.config;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ryan Emerson
 */
public class AphroditeConfig {
    private List<IssueTrackerConfig> issueTrackerConfigs = new ArrayList<>();
    private List<RepositoryConfig> repositoryConfigs = new ArrayList<>();

    public AphroditeConfig() {
    }

    public AphroditeConfig(List<IssueTrackerConfig> issueTrackerConfigs, List<RepositoryConfig> repositoryConfigs) {
        this.issueTrackerConfigs = issueTrackerConfigs;
        this.repositoryConfigs = repositoryConfigs;
    }

    public AphroditeConfig(AphroditeConfig config) {
        this(new ArrayList<>(config.getIssueTrackerConfigs()), new ArrayList<>(config.getRepositoryConfigs()));
    }

    public List<IssueTrackerConfig> getIssueTrackerConfigs() {
        return issueTrackerConfigs;
    }

    public void setIssueTrackerConfigs(List<IssueTrackerConfig> issueTrackerConfigs) {
        this.issueTrackerConfigs = issueTrackerConfigs;
    }

    public List<RepositoryConfig> getRepositoryConfigs() {
        return repositoryConfigs;
    }

    public void setRepositoryConfigs(List<RepositoryConfig> repositoryConfigs) {
        this.repositoryConfigs = repositoryConfigs;
    }
}
