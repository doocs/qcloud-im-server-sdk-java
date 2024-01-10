gpg --gen-key
gpg --keyserver hkp://keyserver.ubuntu.com --send-keys [pubkey id]
gpg --keyserver hkp://keyserver.ubuntu.com --recv-keys [pubkey id]
gpg --armor --output private-key --export-secret-keys [user id]