# selenium-automation

## Managing self hosted agent

1. Download agent zip file
2. Create parsonal access token from azure devops user profile. Grand scope 'Agent Pool' with 'read,manage'
3. Launch Powershell in admin mode
4. Run the following command:
```shell
PS C:\> mkdir agent ; cd agent
PS C:\agent> Add-Type -AssemblyName System.IO.Compression.FileSystem ; [System.IO.Compression.ZipFile]::ExtractToDirectory("$HOME\Downloads\vsts-agent-win-x64-2.211.1.zip", "$PWD")
Configure the agentDetailed instructions
PS C:\agent> .\config.cmd

```
Optionally run the agent interactively
If you didn't run as a service above:
```
PS C:\agent> .\run.cmd
```

5. Update the azure pipeline yaml in your project and add name to the 'pool' as named when configuring your hosted server

That's it!
More Information
